package questions;
import java.util.Scanner;
public class SumOfNumbersInARange {
    public static void main(String[] args) {
        int sum = 0;
        System.out.print("Enter first number: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        System.out.print("Enter second number: ");
        int b = scan.nextInt();

        for(int i = a; i <= b; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
