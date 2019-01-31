/**
 * C08 L08
 * 
 * Demonstrate when constructors are executed.
 */
class A4 {
    A4() {
        System.out.println("Inside A's constructor.");
    }
}

class B4 extends A4 {
    B4() {
        System.out.println("Inside B's constructor.");
    }
}

class C4 extends B4 {
    C4() {
        System.out.println("Inside C's constructor.");
    }
}

public class CallingCons {

    public static void main(String[] args) {
        C4 c = new C4();
    }
}