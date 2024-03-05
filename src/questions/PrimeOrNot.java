package questions;
import java.util.Scanner;
import static java.lang.Math.sqrt;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter number: ");
        int a = scan.nextInt();

        check(a);
    }

    private static void check(int num) {
        boolean isPrime = true;
        if (num < 2) {
            System.out.println("number is not prime");
        }
        else {
            for (int i=2; i<sqrt(num); i++) {
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
