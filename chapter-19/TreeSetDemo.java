import java.util.TreeSet;

/**
 * C19 L06
 * 
 * Demonstrate TreeSet.
 */
public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        System.out.println(ts);
        System.out.println(ts.subSet("C", "F"));
    }
}