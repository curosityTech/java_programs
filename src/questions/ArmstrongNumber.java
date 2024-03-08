package questions;
import java.util.Scanner;
import static java.lang.Math.pow;

public class ArmstrongNumber {
    public static void main(String[] args) {
        double acquiredValue;
        Scanner scan = new Scanner(System.in);

        System.out.print("enter number: ");
        int number = scan.nextInt();

        acquiredValue = check(number);

        if(acquiredValue == number) {
            System.out.println("number is armstrong");
        }
        else {
            System.out.println("number is not armstrong");
        }

    }

    private static double check(int number) {
        int actual=number;
        double remainder, count=0, total=0;

        while(number != 0) {
            number /= 10;
            count += 1;
        }

        while(actual != 0) {
            remainder = actual%10;
            actual /= 10;
            total += pow(remainder, count);
        }
        return total;
    }
}

