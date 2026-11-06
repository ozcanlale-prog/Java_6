package tr.istiklal.edu;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
public class TestCalendar {



    public static void main(String[] args){
        Calendar c = new GregorianCalendar();

        System.out.println("Suan ki zaman " + new Date());
        System.out.println("Yil " + c.get(Calendar.YEAR));
        System.out.println("Month " + c.get(Calendar.MONTH));
        System.out.println("Date " + c.get(Calendar.DATE));
        System.out.println("HOUR " + c.get(Calendar.HOUR));
        System.out.println("HOUR_OF_DAY: " + c.get(Calendar.HOUR_OF_DAY));
        System.out.println("MINUTE: " +  c.get(Calendar.MINUTE));
        System.out.println("SECOND: " + c.get(Calendar.SECOND));
        System.out.println("DAY_OF_MONTH: " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("DAY_OF_WEEK" + c.get(Calendar.DAY_OF_WEEK));
        System.out.println("DAY_OF_YEAR: " + c.get(Calendar.DAY_OF_YEAR));
        System.out.println("WEEK_OF_MONTH: " + c.get(Calendar.WEEK_OF_MONTH));
        System.out.println("WEEK_OF_YEAR: " + c.get(Calendar.WEEK_OF_YEAR));
        System.out.println("AM_PM: " + c.get(Calendar.AM_PM));

        Calendar c2 = new GregorianCalendar(1997,11,25);
        String[] dayNameOfWeek = {"Sunday" , "Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" , "Saturday"};
        System.out.println("December 25, 1997 is a " + dayNameOfWeek[c2.get(Calendar.DAY_OF_WEEK) - 1 ]);


    }

}
