package tr.istiklal.edu;

public class Hesaplayici {

    private int tabanDeger;

    public Hesaplayici(){}
    public Hesaplayici(int tabanDeger){
        this.tabanDeger = tabanDeger;
    }

    public int Kareal(int sayi){
        return sayi*sayi;
    }

    public static void main(String[] args){
        Hesaplayici a = new Hesaplayici();
        int sonuc = a.Kareal(6);
        System.out.println("Kare: " + sonuc);
    }

}