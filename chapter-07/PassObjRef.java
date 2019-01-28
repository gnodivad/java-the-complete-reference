/**
 * C07 L06
 * 
 * Objects are passed through their references.
 */
class Test3 {
    int a, b;

    Test3(int i, int j) {
        a = i;
        b = j;
    }

    void meth(Test3 o) {
        o.a *= 2;
        o.b /= 2;
    }
}

public class PassObjRef {

    public static void main(String[] args) {
        Test3 ob = new Test3(15, 20);

        System.out.println("a and b before call: " + ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("a and b after call: " + ob.a + " " + ob.b);
    }
}