package questions;
import java.util.Scanner;
public class GreatestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = scan.nextInt();

        System.out.print("Enter 2nd number: ");
        int b = scan.nextInt();

        check(a, b);
    }

    private static void check(int num1, int num2) {
        if(num1>num2) {
            System.out.println(num1 + " is greatest between two");
        }
        else if (num1<num2) {
            System.out.println(num2 + " is greatest between two");
        }

        else{
            System.out.println("both are equal");
        }
    }
}
