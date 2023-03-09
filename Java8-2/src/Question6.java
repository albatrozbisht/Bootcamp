import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Question6 {
    public static void main(String[] args) throws ParseException {



        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter date in yyyy-mm-dd format");
        String date1 = sc.next();
        String date2 = sc.next();
        Date d1 = sdformat.parse(date1);
        Date d2 = sdformat.parse(date2);
        System.out.println("The date 1 is: " + sdformat.format(d1));
        System.out.println("The date 2 is: " + sdformat.format(d2));
        if(d1.compareTo(d2) > 0) {
            System.out.println("Date 1 occurs after Date 2");
        } else if(d1.compareTo(d2) < 0) {
            System.out.println("Date 1 occurs before Date 2");
        } else if(d1.compareTo(d2) == 0) {
            System.out.println("Both dates are equal");
        }

        
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        df.setTimeZone(TimeZone.getTimeZone("IST"));

        System.out.println("Date and time in India: " + df.format(date));

        df.setTimeZone(TimeZone.getTimeZone("America/Anguilla"));

        System.out.println("Date and time in America: " + df.format(date));

        df.setTimeZone(TimeZone.getTimeZone("Africa/Asmera"));

        System.out.println("Date and time in Africa: " + df.format(date));
    }
}


//Output:
//        Please enter date in yyyy-mm-dd format
//        2000-12-11
//        2000-12-10
//        The date 1 is: 2000-12-11
//        The date 2 is: 2000-12-10
//        Date 1 occurs after Date 2

//    Date and time in India: 2023-03-09 14:49:21
//        Date and time in America: 2023-03-09 05:19:21
//        Date and time in Africa: 2023-03-09 12:19:21

