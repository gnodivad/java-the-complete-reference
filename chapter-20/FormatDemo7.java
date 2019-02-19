import java.util.Formatter;

/**
 * C20 L20
 * 
 * A very simple example that uses Formatter.
 */
public class FormatDemo7 {

    public static void main(String[] args) {

        try (Formatter fmt = new Formatter()) {
            fmt.format("Formatting %s is easy %d %f", "with Java", 10, 98.6);

            System.out.println(fmt);
        }
    }
}