package questions;
import java.util.Scanner;
public class SumOfNumbersInARange {
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        System.out.print("Enter second number: ");
        int b = scan.nextInt();

        int total = check(a, b);
        System.out.println(total);
    }

    private static int check(int a, int b) {
        int sum = 0;
        for(int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }
}
