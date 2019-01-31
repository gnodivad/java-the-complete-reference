/**
 * C08 L11
 * 
 * Dynamic method dispatch
 */
class A7 {
    void callme() {
        System.out.println("Inside A's callme method");
    }
}

class B7 extends A7 {
    void callme() {
        System.out.println("Inside B's callme method");
    }
}

class C7 extends A7 {
    void callme() {
        System.out.println("Inside C's callme method");
    }
}

public class Dispatch {

    public static void main(String[] args) {
        A7 a = new A7();
        B7 b = new B7();
        C7 c = new C7();

        A7 r;

        r = a;
        r.callme();

        r = b;
        r.callme();

        r = c;
        r.callme();
    }
}