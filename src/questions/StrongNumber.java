package questions;
import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter number: ");
        int number = scan.nextInt();
        int checkStrong = check(number);

        if (number == checkStrong) {
            System.out.println("It is a strong number");
        }
        else {
            System.out.println("It is not a strong number");
        }

    }

    private static int check(int number) {
        int sum=0;
        int rem;
        while(number > 0) {
             rem = number % 10;
            sum += fact(rem);
             number /= 10;
        }
        return sum;
    }

    private static int fact(int rem) {
        int total=0;
        int fact=1;
        for(int i=rem; i>0; i--) {
            fact *= i;
        }
        total += fact;
        return total;
    }
}
