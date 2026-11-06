package tr.istiklal.edu;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color = "white";
    private boolean filled;

    protected GeometricObject() {}

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Soyut metotlar
    public abstract double getArea();
    public abstract double getPerimeter();

    // 1. Comparable arayüzünden gelen zorunlu metot (Alanları kıyaslar)
    @Override
    public int compareTo(GeometricObject o) {
        if (this.getArea() > o.getArea())
            return 1;
        else if (this.getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    // 2. İstediğiniz statik max metodu (Büyük olanı döndürür)
    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        if (o1.compareTo(o2) > 0)
            return o1;
        else
            return o2;
    }
}