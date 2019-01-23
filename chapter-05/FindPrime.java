/**
 * C05 L11
 * 
 * Test for primes
 */
public class FindPrime {

    public static void main(String[] args) {
        int num;
        boolean isPrime;

        num = 14;

        if (num < 2)
            isPrime = false;
        else
            isPrime = true;

        for (int i = 2; i <= num / i; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}