/**
 * C09 L04
 */
public class TestIface {

    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
}