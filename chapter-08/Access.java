/**
 * C08 L02
 * 
 * In a class hierarchy, private members remain private to their class.
 */
class A2 {
    int i;
    private int j;

    void setij(int x, int y) {
        i = x;
        j = y;
    }
}

class B2 extends A2 {
    int total;

    void sum() {
        // total = i + j;
    }
}

public class Access {

    public static void main(String[] args) {
        B2 subOb = new B2();

        subOb.setij(10, 12);

        subOb.sum();
        System.out.println("Total is " + subOb.total);
    }
}