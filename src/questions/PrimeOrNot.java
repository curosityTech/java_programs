package questions;
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter number: ");
        int a = scan.nextInt();

        scan.close();

        check(a);
    }

    private static void check(int num) {
        // If a number n is not a prime, it can be factored into two factors a and b:
        // n = a * b

        /*Now a and b can't be both greater than the square root of n,
        since then the product a * b would be greater than sqrt(n) * sqrt(n) = n.
        So in any factorization of n, at least one of the factors must be smaller
        than the square root of n, and if we can't find any factors less than or equal to
        the square root, n must be a prime.*/

        boolean isPrime = true;
        if (num < 2) {
            System.out.println("number is not prime");
        }
        else {
            for (int i=2; i<=sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("number is prime");
        }
        else {
            System.out.println("number is not prime");
        }
    }
}
