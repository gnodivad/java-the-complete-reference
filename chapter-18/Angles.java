/**
 * C18 L17
 * 
 * Demonstrate toDegrees() and toRadians().
 */
public class Angles {

    public static void main(String[] args) {
        double theta = 120.0;

        System.out.println(theta + " degrees is " + Math.toRadians(theta) + " radians.");

        theta = 1.312;

        System.out.println(theta + " radians is " + Math.toDegrees(theta) + " degrees.");
    }
}