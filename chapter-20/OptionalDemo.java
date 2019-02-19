import java.util.Optional;

/**
 * C20 L03
 * 
 * Demonstrate several Optional<T> methods.
 */
public class OptionalDemo {

    public static void main(String[] args) {
        Optional<String> noVal = Optional.empty();

        Optional<String> hasVal = Optional.of("ABCDEFG");

        if (noVal.isPresent()) {
            System.out.println("This won't be displayed.");
        } else {
            System.out.println("noVal has no value");
        }

        if (hasVal.isPresent()) {
            System.out.println("The string in hasVal is: " + hasVal.get());
        }

        String defStr = noVal.orElse("Default String");
        System.out.println(defStr);
    }
}