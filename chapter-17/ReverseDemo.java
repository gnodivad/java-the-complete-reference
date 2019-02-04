/**
 * C17 L17
 * 
 * Using reverse() to reverse a StringBuffer.
 */
public class ReverseDemo {

    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("abcdef");

        System.out.println(s);
        s.reverse();
        System.out.println(s);
    }
}