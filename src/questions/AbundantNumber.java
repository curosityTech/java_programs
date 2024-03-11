package questions;
import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter number: ");
        int number = scan.nextInt();

        check(number);
    }

    private static void check(int number) {
        int total=0;
        for(int i=1; i<number; i++) {
            if(number%i == 0) {
                total += i;
            }
        }

        if(total > number) {
            System.out.println("It is an abundant number");
        }
        else{
            System.out.println("It is not an abundant number");
        }
    }
}
