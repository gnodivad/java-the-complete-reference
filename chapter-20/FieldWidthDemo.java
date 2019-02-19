import java.util.Formatter;

/**
 * C20 L15
 * 
 * Create a table of squares and cubes.
 */
public class FieldWidthDemo {

    public static void main(String[] args) {
        Formatter fmt;

        for (int i = 1; i <= 10; i++) {
            fmt = new Formatter();
            fmt.format("%4d %4d %4d", i, i * i, i * i * i);
            System.out.println(fmt);
            fmt.close();
        }
    }
}