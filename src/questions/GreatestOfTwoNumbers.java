package questions;
import java.util.Scanner;
public class GreatestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = scan.nextInt();

        System.out.print("Enter 2nd number: ");
        int b = scan.nextInt();

        if(a>b) {
            System.out.println(a + " is greatest between two");
        }
        else if (a<b) {
            System.out.println(b + " is greatest between two");
        }

        else{
            System.out.println("both are equal");
        }
    }
}
