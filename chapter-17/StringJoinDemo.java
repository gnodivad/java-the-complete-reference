/**
 * C17 L12
 * 
 * Demonstrate the join() method defined by String.
 */
public class StringJoinDemo {

    public static void main(String[] args) {
        String result = String.join(" ", "Alpha", "Beta", "Gamma");
        System.out.println(result);

        result = String.join(", ", "John", "ID#: 569", "Email: John@HerbSchildt.com");
        System.out.println(result);
    }
}