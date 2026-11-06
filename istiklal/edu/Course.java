package tr.istiklal.edu;

import java.util.Arrays;

public class Course implements Cloneable {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            // Dizi dolduğunda kapasiteyi artırabiliriz
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        // Öğrenci silme mantığı (Liang kitabındaki standart yapı)
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                for (int k = i; k < numberOfStudents - 1; k++) {
                    students[k] = students[k + 1];
                }
                students[numberOfStudents - 1] = null;
                numberOfStudents--;
                break;
            }
        }
    }

    // Derin kopya (Deep Copy) sağlayan clone metodu
    @Override
    public Object clone() {
        try {
            // 1. Önce yüzeysel kopya (shallow copy) alıyoruz
            Course cloneCourse = (Course) super.clone();

            // 2. students dizisinin referansını doğrudan kopyalamak yerine,
            // bellekte tamamen yeni bir dizi oluşturup elemanları kopyalıyoruz (Deep Copy)
            cloneCourse.students = new String[this.students.length];
            System.arraycopy(this.students, 0, cloneCourse.students, 0, this.numberOfStudents);

            return cloneCourse;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}