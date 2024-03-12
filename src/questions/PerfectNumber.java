package questions;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter number: ");
        int number = scan.nextInt();

        scan.close();

        int check = sum(number);

        if(check == number) {
            System.out.println("It is a perfect number");
        }
        else {
            System.out.println("It is not a perfect number");
        }
    }

    public static int sum(int number) {
        int total=0;
        for(int i=1; i<number; i++) {
            if(number%i == 0) {
                total += i;
            }
        }
        return total;
    }

}
