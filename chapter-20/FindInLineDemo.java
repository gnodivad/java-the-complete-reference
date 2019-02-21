import java.util.Scanner;

/**
 * C20 L25
 * 
 * Demonstrate findInLine().
 */
public class FindInLineDemo {

    public static void main(String[] args) {
        String instr = "Name: Tom Age: 28 ID: 77";

        Scanner conin = new Scanner(instr);

        conin.findInLine("Age:");

        if (conin.hasNext()) {
            System.out.println(conin.next());
        } else {
            System.out.println("Error!");
        }

        conin.close();
    }
}