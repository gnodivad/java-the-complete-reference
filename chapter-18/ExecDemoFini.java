/**
 * C18 L08
 * 
 * Wait until notepad is terminated.
 */
public class ExecDemoFini {

    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;

        try {
            p = r.exec("notepad");
            p.waitFor();
        } catch (Exception e) {
            System.out.println("Error executing notepad.");
        }

        System.out.println("Notepad returned " + p.exitValue());
    }
}