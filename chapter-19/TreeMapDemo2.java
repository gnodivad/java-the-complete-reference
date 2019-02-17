import java.util.*;

/**
 * C19 L16
 * 
 * Use a comparator to sort accounts by last name.
 */
class TComp implements Comparator<String> {
    @Override
    public int compare(String aStr, String bStr) {
        int i, j, k;

        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');

        k = aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
        if (k == 0) {
            return aStr.compareToIgnoreCase(bStr);
        } else {
            return k;
        }
    }
}

public class TreeMapDemo2 {

    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<>(new TComp());

        tm.put("John Doe", 3434.34);
        tm.put("Tom Smith", 123.22);
        tm.put("Jane Baker", 1378.00);
        tm.put("Tod Hall", 99.22);
        tm.put("Ralph Smith", -19.08);

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = tm.get("John Doe");
        tm.put("John Doe", balance + 1000);

        System.out.println("John Doe's new balance: " + tm.get("John Doe"));
    }
}