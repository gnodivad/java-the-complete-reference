import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * C20 L22
 * 
 * Use Scanner to compute an average of the values in a file.
 */
public class AvgFile {

    public static void main(String[] args) throws IOException {
        int count = 0;
        double sum = 0.0;

        FileWriter fout = new FileWriter("chapter-20/Test.txt");
        fout.write("2 3.4 5 6 7.4 9.1 10.5 done");
        fout.close();

        FileReader fin = new FileReader("chapter-20/Test.txt");

        Scanner src = new Scanner(fin);

        System.out.println("Enter numbers to average.");

        while (src.hasNext()) {
            if (src.hasNextDouble()) {
                sum += src.nextDouble();
                count++;
            } else {
                String str = src.next();
                if (str.equals("done")) {
                    break;
                } else {
                    System.out.println("Data format error.");
                    return;
                }
            }
        }

        src.close();
        System.out.println("Average is " + sum / count);
    }
}