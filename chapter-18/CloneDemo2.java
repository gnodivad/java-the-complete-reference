/**
 * C18 L15
 * 
 * Override the clone() method.
 */
class TestClone2 implements Cloneable {
    int a;
    double b;

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not allowed.");
            return this;
        }
    }
}

class CloneDemo2 {
    public static void main(String[] args) {
        TestClone2 x1 = new TestClone2();
        TestClone2 x2;

        x1.a = 10;
        x1.b = 20.98;

        x2 = (TestClone2) x1.clone();

        System.out.println("x1: " + x1.a + " " + x1.b);
        System.out.println("x2: " + x2.a + " " + x2.b);
    }
}