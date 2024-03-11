package questions;
import java.util.Scanner;
import static java.lang.Math.pow;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter number: ");
        int number = scan.nextInt();

        check(number);
    }

    private static void check(int number) {
        double power = pow(number, 2);

        double rem = power % 10;
        if(rem == number) {
            System.out.println("Number is automorphic");
        }
        else {
            System.out.println("Number is not automorphic");
        }
    }
}
