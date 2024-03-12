package questions;
import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter number: ");
        int num = scan.nextInt();

        scan.close();

        int rev_num = reverse(num);
        System.out.println("reverse number is: " + rev_num);
    }

    private static int reverse(int num) {
        int rev=0, rem;
        while(num != 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num /= 10;
        }
        return rev;
    }
}
