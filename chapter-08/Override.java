/**
 * C08 L09
 * 
 * Method overriding.
 */
class A5 {
    int i, j;

    A5(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B5 extends A5 {
    int k;

    B5(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        System.out.println("k: " + k);
    }
}

public class Override {

    public static void main(String[] args) {
        B5 subOb = new B5(1, 2, 3);

        subOb.show();
    }
}
