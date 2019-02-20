import java.util.Scanner;

/**
 * C20 L21
 * 
 * Use Scanner to compute an average of the values.
 */
public class AvgNums {

    public static void main(String[] args) {
        Scanner conin = new Scanner(System.in);

        int count = 0;
        double sum = 0.0;

        System.out.println("Enter numbers to average.");

        while (conin.hasNext()) {
            if (conin.hasNextDouble()) {
                sum += conin.nextDouble();
                count++;
            } else {
                String str = conin.next();
                if (str.equals("done")) {
                    break;
                } else {
                    System.out.println("Data format error.");
                    return;
                }
            }
        }

        conin.close();
        System.out.println("Average is " + sum / count);
    }
}