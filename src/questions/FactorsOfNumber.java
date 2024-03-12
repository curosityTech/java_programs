package questions;
import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter the number whose factors you need to find: ");
        int number = scan.nextInt();

        scan.close();

        factors(number);
    }

    private static void factors(int number) {
        for(int i=1; i<=number; i++) {
            if(number%i == 0) {
                System.out.println(i);
            }
        }
    }
}
