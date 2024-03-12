package questions;
import java.util.Scanner;
public class SumOfDigitsOfANumber {
    public static void main(String[] args) {
        System.out.print("enter number: ");
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        scan.close();

        sum(num);
    }

    private static void sum(int num) {
        int total = 0, digit;
        while(num != 0) {
            digit = num % 10;
            total += digit;
            num /= 10;
        }
        System.out.println("sum of digits are: " + total);
    }
}
