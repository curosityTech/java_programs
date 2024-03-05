package questions;
import java.util.Scanner;
public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter 1st number: ");
        int a = scan.nextInt();

        System.out.print("enter 2nd number: ");
        int b = scan.nextInt();

        System.out.print("enter 3rd number: ");
        int c = scan.nextInt();

        check(a, b, c);
    }

    private static void check(int a, int b, int c) {
        if ( a==b && a==c) {
            System.out.println("cannot find greatest because all three values are similar");
        }
        else if (a==b || a==c || b==c) {
            System.out.println("cannot find greatest between three because 2 of them are similar");
        }
        else if (a>b && a>c) {
            System.out.println(a + " is greatest among three");
        }
        else if (b>a && b>c) {
            System.out.println(b + " is greatest among three");
        }
        else {
            System.out.println(c + " is greatest among three");
        }
    }
}
