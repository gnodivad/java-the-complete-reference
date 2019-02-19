import java.util.Currency;
import java.util.Locale;

/**
 * C20 L09
 * 
 * Demonstrate Currency.
 */
public class CurDemo {

    public static void main(String[] args) {
        Currency c;

        c = Currency.getInstance(Locale.US);

        System.out.println("Symbol: " + c.getSymbol());
        System.out.println("Default fractional digits: " + c.getDefaultFractionDigits());
    }
}