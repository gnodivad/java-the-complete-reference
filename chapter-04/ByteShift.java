/**
 * C04 L06
 * 
 * Left shifting a byte value.
 */
public class ByteShift {

    public static void main(String[] args) {
        byte a = 64, b;
        int i;

        i = a << 2;
        b = (byte) (a << 2);

        System.out.println("Original value of a: " + a);
        System.out.println("i and b: " + i + " " + b);
    }
}