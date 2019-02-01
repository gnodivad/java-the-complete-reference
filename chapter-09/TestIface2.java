/**
 * C09 L05
 */
public class TestIface2 {

    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);

        c = ob;
        c.callback(42);
    }
}