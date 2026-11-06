package tr.istiklal.edu;

public class ComparableCircle extends Circle implements Comparable<GeometricObject> {

    // 1. Parametresiz Kurucu Metot (Constructor)
    public ComparableCircle() {
        super();
    }

    // 2. Yarıçap Alan Kurucu Metot
    public ComparableCircle(double radius) {
        super(radius);
    }

    // 3. Yarıçap, Renk ve Doluluk Durumu Alan Kurucu Metot
    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    // Comparable arayüzünden gelen compareTo metodu (GeometricObject alır)
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

    // Nesneyi ekrana rahat yazdırabilmek için toString metodu
    @Override
    public String toString() {
        return super.toString() + " (Radius: " + getRadius() + ", Area: " + getArea() + ")";
    }
}