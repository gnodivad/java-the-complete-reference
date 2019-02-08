/**
 * C18 L09
 * 
 * Demonstrate Runtime.Version relase counters.
 */
public class VerDemo {

    public static void main(String[] args) {
        Runtime.Version ver = Runtime.version();

        System.out.println("Feature release counter: " + ver.feature());
        System.out.println("Interim release counter: " + ver.interim());
        System.out.println("Update release counter: " + ver.update());
        System.out.println("Patch release counter: " + ver.patch());
    }
}