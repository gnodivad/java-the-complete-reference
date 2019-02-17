import java.util.*;

/**
 * C19 L25
 * 
 * Use a default property list.
 */
public class PropDemoDef {

    public static void main(String[] args) {
        Properties defList = new Properties();
        defList.setProperty("Florida", "Tallahassee");
        defList.setProperty("Wisconsin", "Madison");

        Properties capitals = new Properties(defList);

        capitals.setProperty("Illinois", "Springfield");
        capitals.setProperty("Missouri", "Jefferson City");
        capitals.setProperty("Washington", "Olympia");
        capitals.setProperty("Califonia", "Sacramento");
        capitals.setProperty("Indiana", "Indianapolis");

        Set<?> states = capitals.keySet();

        for (Object name : states)
            System.out.println("The capital of " + name + " is " + capitals.getProperty((String) name) + ".");

        System.out.println();

        String str = capitals.getProperty("Florida");
        System.out.println("The capital of Florida is " + str + ".");
    }
}