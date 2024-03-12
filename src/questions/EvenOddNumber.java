package questions;
import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        scan.close();

        check(number);
    }

    private static void check(int number) {
        if (number % 2 == 0) {
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }

        // Ternary method
        /*
        String status = number % 2 == 0 ? "number is even" : "number is odd";
        System.out.println("status is: " + status);
         */
    }
}
