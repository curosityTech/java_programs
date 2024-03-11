package questions;
import java.util.Scanner;

public class FriendlyPair {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter first number: ");
        int a = scan.nextInt();

        System.out.print("enter second number: ");
        int b = scan.nextInt();

        int totalA = check(a);
        int totalB = check(b);

        if((totalA/a) == (totalB/b)) {
            System.out.println("The numbers are friendly pair");
        }
    }

    private static int check(int number) {
        return sumOfFactors(number);
    }

    private static int sumOfFactors(int number) {
        int total=0;
        for(int i=1; i<number; i++) {
            if(number%i == 0) {
                total += i;
            }
        }
        return total;
    }

}
