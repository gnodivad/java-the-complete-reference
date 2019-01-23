/**
 * C05 L07
 * 
 * The target of a loop can be empty.
 */
public class NoBody {

    public static void main(String[] args) {
        int i, j;

        i = 100;
        j = 200;

        while (++i < --j)
            ;

        System.out.println("Midpoint is " + i);
    }
}