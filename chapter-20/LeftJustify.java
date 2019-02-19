import java.util.Formatter;

/**
 * C20 L17
 * 
 * Demonstrate left justification.
 */
public class LeftJustify {

    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        fmt.format("|%10.2f|", 123.123);
        System.out.println(fmt);
        fmt.close();

        fmt = new Formatter();
        fmt.format("|%-10.2f|", 123.123);
        System.out.println(fmt);
        fmt.close();
    }
}