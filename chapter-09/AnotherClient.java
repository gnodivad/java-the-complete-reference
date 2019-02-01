/**
 * C09 L05
 * 
 * Another implementation of Callback.
 */
public class AnotherClient implements Callback {

    public void callback(int p) {
        System.out.println("Another version of callback");
        System.out.println("p squared is " + (p * p));
    }
}