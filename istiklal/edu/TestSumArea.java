package tr.istiklal.edu;

public class TestSumArea {

    // GeometricObject dizisinin alanlarını toplayan statik metot
    public static double sumArea(GeometricObject[] a) {
        double totalArea = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != null) {
                totalArea += a[i].getArea();
            }
        }
        return totalArea;
    }

    public static void main(String[] args) {
        // 1. 4 elemanlı bir GeometricObject dizisi oluşturalım (2 Daire, 2 Dikdörtgen)
        GeometricObject[] objects = new GeometricObject[4];

        objects[0] = new Circle(2.0);        // Yarıçapı 2 olan daire
        objects[1] = new Circle(3.5);        // Yarıçapı 3.5 olan daire
        objects[2] = new Rectangle(3.0, 4.0); // 3x4 lük dikdörtgen
        objects[3] = new Rectangle(5.0, 2.0); // 5x2 lik dikdörtgen

        // 2. sumArea metodunu çağırarak toplam alanı hesaplayalım
        double toplamAlan = sumArea(objects);

        // 3. Sonuçları ekrana yazdıralım
        System.out.println("--- Geometrik Nesnelerin Alan Toplamı ---");
        for (int i = 0; i < objects.length; i++) {
            System.out.println((i + 1) + ". Nesne (" + objects[i].getClass().getSimpleName() + ") Alanı: " + objects[i].getArea());
        }

        System.out.println("\nTüm Nesnelerin Toplam Alanı: " + toplamAlan);
    }
}