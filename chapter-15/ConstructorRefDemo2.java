/**
 * C15 L16
 * 
 * Demonstrate a constructor reference with a generic class.
 */
interface MyFunc6<T> {
    MyClass3<T> func(T n);
}

class MyClass3<T> {
    private T val;

    MyClass3(T v) {
        val = v;
    }

    MyClass3() {
        val = null;
    }

    T getVal() {
        return val;
    }
}

public class ConstructorRefDemo2 {
    public static void main(String[] args) {
        MyFunc6<Integer> myClassCons = MyClass3<Integer>::new;

        MyClass3<Integer> mc = myClassCons.func(100);

        System.out.println("val in mc is " + mc.getVal());
    }
}