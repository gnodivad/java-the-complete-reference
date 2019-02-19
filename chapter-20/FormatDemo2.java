import java.util.Formatter;

/**
 * C20 L11
 * 
 * Demonstrate the %f and %e format specifiers.
 */
public class FormatDemo2 {

    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        for (double i = 1.23; i < 1.0e+6; i *= 100) {
            fmt.format("%f %e", i, i);
            System.out.println(fmt);
        }
        fmt.close();
    }
}