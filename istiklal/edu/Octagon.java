package tr.istiklal.edu;

public class Octagon extends GeometricObject implements Comparable<GeometricObject>, Cloneable {
    private double side;

    // 1. Parametresiz Kurucu (Side 0)
    public Octagon() {
        this.side = 0.0;
    }

    // 2. Belirtilen Kenar Uzunluğu ile Kurucu
    public Octagon(double side) {
        this.side = side;
    }

    // Side için Getter ve Setter
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    // Alan Hesabı: area = (2 + 4/sqrt(2)) * side * side
    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    // Çevre Hesabı: 8 eşit kenar olduğu için 8 * side
    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    // Comparable arayüzünden gelen compareTo metodu
    @Override
    public int compareTo(GeometricObject o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    // Cloneable arayüzü için derin/yüzeysel kopya (clone) metodu
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " (Octagon Side: " + side + ", Area: " + getArea() + ", Perimeter: " + getPerimeter() + ")";
    }
}