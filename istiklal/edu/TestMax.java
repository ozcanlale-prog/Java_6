package tr.istiklal.edu;

public class TestMax {
    public static void main(String[] args) {
        // İki daire oluşturalım (Yarıçapları: 3 ve 5)
        Circle c1 = new Circle(3.0);
        Circle c2 = new Circle(5.0);

        // İki dikdörtgen oluşturalım (Kenarları: 2x4 ve 3x3)
        Rectangle r1 = new Rectangle(2.0, 4.0);
        Rectangle r2 = new Rectangle(3.0, 3.0);

        // max metodunu kullanarak büyük olanları bulalım (GeometricObject1 yerine GeometricObject yapıldı)
        GeometricObject buyukDaire = GeometricObject.max(c1, c2);
        GeometricObject buyukDikdortgen = GeometricObject.max(r1, r2);

        // Sonuçları yazdıralım
        System.out.println("Daireler içinde büyük olanın alanı: " + buyukDaire.getArea());
        System.out.println("Dikdörtgenler içinde büyük olanın alanı: " + buyukDikdortgen.getArea());
    }
}