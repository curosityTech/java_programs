package questions;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter nth value: ");
        int number = scan.nextInt();

        scan.close();

        print(number);
    }

    private static void print(int number) {
        int first_term = 0, second_term = 1;
        int total;

        System.out.println(first_term);
        System.out.println(second_term);

        for(int i=2; i<=number; i++) {
            total = first_term + second_term;
            first_term = second_term;
            second_term = total;
            System.out.println(total);
        }

    }
}
