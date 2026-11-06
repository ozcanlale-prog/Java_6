package tr.istiklal.edu;

import java.util.*;
import tr.istiklal.edu.GeometricObject1;

public class Triangle extends GeometricObject {
    // Üçgenin üç kenar uzunluğu
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle(){
    }

    // Kenarları alan constructor
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea(){
        // Heron formülü ile alan hesaplama
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter(){
        // Üç kenarın toplamı çevre verir
        return side1 + side2 + side3;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1. kenarı giriniz: ");
        double s1 = input.nextDouble();

        System.out.print("2. kenarı giriniz: ");
        double s2 = input.nextDouble();

        System.out.print("3. kenarı giriniz: ");
        double s3 = input.nextDouble();

        System.out.print("Rengi giriniz: ");
        String renk = input.next();

        System.out.print("Dolu mu? (true/false): ");
        boolean doluMu = input.nextBoolean();

        // Nesneyi oluşturuyoruz
        Triangle t = new Triangle(s1, s2, s3);
        t.setColor(renk);
        t.setFilled(doluMu);

        // Sonuçları yazdırıyoruz
        System.out.println("Üçgen Alanı: " + t.getArea());
        System.out.println("Üçgen Çevresi: " + t.getPerimeter());
        System.out.println("Renk: " + t.getColor());
        System.out.println("Dolu mu: " + t.isFilled());

        input.close();
    }
}