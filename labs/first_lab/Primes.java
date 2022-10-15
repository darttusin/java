package first_lab;
/**
*Class Primes check first 100 numbers to be a prime number
*/

public class Primes {

    /**
    * Main function processes data
    */

    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    /**
    * Check number for prime
    */

    public static boolean isPrime(int num) {

        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0)
                return false;
        }
        return true;
    }
}