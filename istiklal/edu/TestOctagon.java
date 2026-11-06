package tr.istiklal.edu;

public class TestOctagon {
    public static void main(String[] args) {
        // 1. Kenar uzunluğu 5 olan bir Octagon nesnesi oluşturalım
        Octagon octagon1 = new Octagon(5.0);

        // Alan ve çevresini ekrana yazdıralım
        System.out.println("--- Orijinal Octagon ---");
        System.out.println("Alan: " + octagon1.getArea());
        System.out.println("Çevre: " + octagon1.getPerimeter());

        // 2. clone metodunu kullanarak yeni bir nesne oluşturalım
        Octagon octagon2 = (Octagon) octagon1.clone();

        // 3. compareTo metodunu kullanarak iki nesneyi karşıştıralım
        int comparisonResult = octagon1.compareTo(octagon2);

        System.out.println("\n--- Karşılaştırma Sonucu ---");
        if (comparisonResult > 0) {
            System.out.println("Birinci sekizgen daha büyük.");
        } else if (comparisonResult < 0) {
            System.out.println("İkinci sekizgen daha büyük.");
        } else {
            System.out.println("İki sekizgenin alanları birbirine eşittir (Klon nesne olduğu için beklenildiği gibi).");
        }

        System.out.println("Karşılaştırma (compareTo) kodu çıktısı: " + comparisonResult);
    }
}