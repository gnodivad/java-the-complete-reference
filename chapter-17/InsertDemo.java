/**
 * C17 L16
 * 
 * Demonstrate insert()
 */
public class InsertDemo {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("I Java!");

        sb.insert(2, "like ");
        System.out.println(sb);
    }
}