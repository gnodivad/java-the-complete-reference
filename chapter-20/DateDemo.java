import java.util.Date;

/**
 * C20 L04
 * 
 * Show date and time using only Date methods.
 */
public class DateDemo {

    public static void main(String[] args) {
        Date date = new Date();

        System.out.println(date);

        long msec = date.getTime();
        System.out.println("Milliseconds since Jan. 1, 1970 GMT = " + msec);
    }
}