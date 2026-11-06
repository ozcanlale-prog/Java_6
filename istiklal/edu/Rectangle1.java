package tr.istiklal.edu;

public class Rectangle extends GeometricObject implements Comparable<GeometricObject> {
    private double width;
    private double height;

    // 1. Parametresiz Kurucu
    public Rectangle() {
    }

    // 2. Genişlik ve Yükseklik Alan Kurucu
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 3. Genişlik, Yükseklik, Renk ve Doluluk Alan Kurucu
    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    // Width ve Height için Getter ve Setter metotları
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // GeometricObject'ten gelen soyut metotların implementasyonu
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // equals metodunun ezilmesi (Override): Alanları aynıysa iki dikdörtgen eşittir
    @Override
    public boolean equals(Object o) {
        if (o instanceof Rectangle) {
            return this.getArea() == ((Rectangle) o).getArea();
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
        return super.toString() + " (Rectangle Width: " + width + ", Height: " + height + ", Area: " + getArea() + ")";
    }
}