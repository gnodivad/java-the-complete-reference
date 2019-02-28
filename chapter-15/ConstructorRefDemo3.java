/**
 * C15 L17
 * 
 * Implement a simple class factory using a constructor reference.
 */
interface MyFunc7<R, T> {
    R func(T n);
}

class MyClass7<T> {
    private T val;

    MyClass7(T v) {
        val = v;
    }

    MyClass7() {
        val = null;
    }

    T getVal() {
        return val;
    }
}

class MyClass8 {
    String str;

    MyClass8(String s) {
        str = s;
    }

    MyClass8() {
        str = "";
    }

    String getVal() {
        return str;
    }
}

public class ConstructorRefDemo3 {
    static <R, T> R myClassFactory(MyFunc7<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        MyFunc7<MyClass7<Double>, Double> myClassCons = MyClass7<Double>::new;

        MyClass7<Double> mc = myClassFactory(myClassCons, 100.1);

        System.out.println("val in mc is " + mc.getVal());

        MyFunc7<MyClass8, String> myClassCons2 = MyClass8::new;

        MyClass8 mc2 = myClassFactory(myClassCons2, "Lambda");

        System.out.println("str in mc2 is " + mc2.getVal());
    }
}