package questions;
import java.util.Scanner;
import static java.lang.Math.floor;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter number: ");
        int number = scan.nextInt();

        scan.close();

        check(number);
    }

    private static void check(int number) {
        double total = 0, actual=number;
        int rem;
        while(number>0) {
            rem = number%10;
            total += rem;
            number /= 10;
        }
        double result = actual/total;

        if(result == floor(result)) {
            System.out.println("It is a harshad number");
        }
        else {
            System.out.println("It is not a harshad number");
        }
    }
}
