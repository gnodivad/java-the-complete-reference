import java.util.*;

/**
 * C19 L18
 * 
 * Demonstrate various algorithms.
 */
public class AlgorithmsDemo {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);

        Comparator<Integer> r = Collections.reverseOrder();

        Collections.sort(ll, r);

        System.out.print("List sorted in reverse: ");
        for (int i : ll)
            System.out.print(i + " ");

        System.out.println();

        Collections.shuffle(ll);

        System.out.print("List shuffled: ");
        for (int i : ll)
            System.out.print(i + " ");

        System.out.println();
        System.out.println("Minimum: " + Collections.min(ll));
        System.out.println("Maximum: " + Collections.max(ll));
    }
}