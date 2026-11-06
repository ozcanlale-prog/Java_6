package tr.istiklal.edu;

public class Square extends GeometricObject implements Colorable {
    private double side;

    // 1. Parametresiz kurucu metot (Side 0 olacak şekilde)
    public Square() {
        this.side = 0.0;
    }

    // 2. Belirtilen kenar uzunluğu ile kurucu metot
    public Square(double side) {
        this.side = side;
    }

    // side için Getter ve Setter metotları
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    // GeometricObject sınıfından gelen soyut metotların implementasyonu
    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    // Colorable arayüzünden gelen metot
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    // Nesneyi ekrana yazdırmak için toString
    @Override
    public String toString() {
        return super.toString() + " (Square Side: " + side + ", Area: " + getArea() + ")";
    }
}