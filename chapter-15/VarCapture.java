/**
 * C15 L09
 * 
 * An example of capturing a local variable from the enclosing scope.
 */
interface MyFunc {
    int func(int n);
}

public class VarCapture {

    public static void main(String[] args) {
        final int num = 10;

        MyFunc myLambda = (n) -> {
            int v = num + n;

            // num++;

            return v;
        };

        // num = 9;
    }
}