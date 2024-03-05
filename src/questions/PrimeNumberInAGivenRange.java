package questions;
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class PrimeNumberInAGivenRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter first number: ");
        int first_num = scan.nextInt();

        System.out.print("enter last number: ");
        int last_num = scan.nextInt();

        for(int i=first_num; i<=last_num; i++) {
            print(i);
        }
    }

    private static void print(int num) {
        boolean isPrime = true;
        for (int i=2; i<=sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println(num);
        }
    }
}
