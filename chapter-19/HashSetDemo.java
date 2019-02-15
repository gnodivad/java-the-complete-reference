import java.util.HashSet;

/**
 * C19 L04
 * 
 * Demonstrate HashSet.
 */
public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");

        System.out.println(hs);
    }
}