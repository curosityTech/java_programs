package questions;
import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter base number: ");
        int base = scan.nextInt();

        System.out.print("enter power: ");
        int power = scan.nextInt();

        scan.close();

        int total = power(base, power);
        System.out.println(total);
    }

    private static int power(int base, int power) {
        int total=1;
        for(int i=1; i<=power; i++) {
            total *= base;
        }
        return total;
    }
}
