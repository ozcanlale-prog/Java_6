package tr.istiklal.edu;
import java.lang.management.ManagementFactory;
import java.util.*;

public class TestGeometricObject   {
    public static boolean equalArea(GeometricObject geo1, GeometricObject geo2){
        System.out.println("Objeler esit mi? ");
        System.out.println();
        return geo1.getArea() == geo2.getArea();
         }

         public static void displayGemetricObject(GeometricObject object){
            System.out.println();
            System.out.println("Alan: " + object.getArea());
            System.out.println("Cevre :" + object.getPerimeter());
         }

    public static void main(String[] args) {
        GeometricObject geo1 = new Circle(12);
        GeometricObject geo2 = new Rectangle(23,34);

        displayGemetricObject(geo1);
        displayGemetricObject(geo2);


        System.out.println(equalArea(geo1,geo2));

    }
}

