package tr.istiklal.edu;

public class TestColorable {
    public static void main(String[] args) {
        // 5 elemanlı bir GeometricObject dizisi oluşturalım
        GeometricObject[] objects = new GeometricObject[5];

        objects[0] = new Circle(3.0);
        objects[1] = new Square(4.0);     // Square, Colorable'dır
        objects[2] = new Rectangle(2.0, 5.0);
        objects[3] = new Square(6.5);     // Square, Colorable'dır
        objects[4] = new Triangle(3.0, 4.0, 5.0);

        // Dizi üzerindeki her bir nesneyi döngüye alalım
        for (int i = 0; i < objects.length; i++) {
            System.out.println("\nNesne " + (i + 1) + " Türü: " + objects[i].getClass().getSimpleName());
            System.out.println("Alan: " + objects[i].getArea());

            // Nesne Colorable arayüzünü uyguluyor mu kontrol edelim
            if (objects[i] instanceof Colorable) {
                ((Colorable) objects[i]).howToColor();
            }
        }
    }
}