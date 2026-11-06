package tr.istiklal.edu;

public class Circle extends GeometricObject implements Comparable<GeometricObject> {
    private double radius;

    // 1. Parametresiz Kurucu
    public Circle() {
    }

    // 2. Yarıçap Alan Kurucu
    public Circle(double radius) {
        this.radius = radius;
    }

    // 3. Yarıçap, Renk ve Doluluk Alan Kurucu
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Yarıçap için Getter ve Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // GeometricObject'ten gelen soyut metotların implementasyonu
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // equals metodunun ezilmesi (Override): Yarıçapları aynıysa iki daire eşittir
    @Override
    public boolean equals(Object o) {
        if (o instanceof Circle) {
            return this.radius == ((Circle) o).radius;
        }
        return false;
    }

    // Comparable arayüzünden gelen compareTo metodu (Alanlarına göre kıyaslama)
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

    @Override
    public String toString() {
        return super.toString() + " (Circle Radius: " + radius + ")";
    }
}