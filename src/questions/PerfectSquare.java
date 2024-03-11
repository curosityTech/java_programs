package questions;
import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.floor;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter number: ");
        int number = scan.nextInt();

        check(number);
    }

    private static void check(int number) {

        double value = sqrt(number);

        if(value == floor(value)) {
            System.out.println("It is perfect square");
        }
        else {
            System.out.println("It is not a perfect square");
        }
    }
}
