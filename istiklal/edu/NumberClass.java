package tr.istiklal.edu;
import java.util.ArrayList;
import java.math.*;

public class NumberClass {

    public static Number getLargestNumbers(ArrayList<Number> list){
        if(list == null || list.size() == 0)
            return null;

        Number number = list.get(0);
        for(int i = 1; i<list.size();i++){
            if(number.doubleValue() < list.get(i).doubleValue())
            number = list.get(i);
        }
        return number;
    }

    public static void main() {
        ArrayList<Number> list = new ArrayList<>();
        list.add(45);
        list.add(34445.53);
        list.add(new BigInteger("3432323234344343101"));
        list.add(new BigDecimal("2.0909090989091343433344343"));

        System.out.println("Buyuk olan sayi : " + getLargestNumbers(list));
    }








}
