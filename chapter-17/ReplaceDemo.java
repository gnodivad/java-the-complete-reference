/**
 * C17 L19
 * 
 * Demonstrate replace().
 */
public class ReplaceDemo {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This is a test.");

        sb.replace(5, 7, "was");
        System.out.println("After replace: " + sb);
    }
}