package questions;
import java.util.Scanner;

public class NumberIsPalindromeOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scan.nextInt();

        scan.close();

        check(number);
    }

    private static void check(int number) {
        int rem, rev=0, actual = number;
        while(number != 0) {
            rem = number%10;
            rev = (rev*10) + rem;
            number /= 10;
        }

        if(rev == actual) {
            System.out.println("number is a palindrome");
        }

        else {
            System.out.println("number is not palindrome");
        }
    }
}
