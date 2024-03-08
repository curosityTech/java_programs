package questions;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter number: ");
        int number = scan.nextInt();

        int total = fact(number);
        System.out.println(total);
    }

    private static int fact(int number) {
        int total=1;
        while(number>0) {
            total=total*number;
            number -= 1;
        }
        return total;
    }
}
