import java.util.Formatter;

/**
 * C20 L16
 * 
 * Demonstrate the precision modifier.
 */
public class PrecisionDemo {

    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        fmt.format("%.4f", 123.1234567);
        System.out.println(fmt);
        fmt.close();

        fmt = new Formatter();
        fmt.format("%16.2e", 123.1234567);
        System.out.println(fmt);
        fmt.close();

        fmt = new Formatter();
        fmt.format("%.15s", "Formatting with Java is now easy.");
        System.out.println(fmt);
        fmt.close();
    }
}