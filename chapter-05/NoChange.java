/**
 * C05 L17
 * 
 * The for-each loop is essentially read-only.
 */
public class NoChange {

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int x : nums) {
            System.out.print(x + " ");
            x = x * 10;
        }

        System.out.println();

        for (int x : nums) {
            System.out.print(x + " ");
        }

        System.out.println();
    }
}