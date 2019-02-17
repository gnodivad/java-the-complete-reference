import java.util.TreeSet;

/**
 * C19 L15
 * 
 * Use a lambda expression to create a reverse comparator.
 */
public class CompDemo2 {

    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>((aStr, bStr) -> bStr.compareTo(aStr));

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for (String element : ts)
            System.out.println(element + " ");

        System.out.println();
    }
}