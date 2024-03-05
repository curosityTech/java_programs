package questions;
import java.util.Scanner;
// Same method is used to find the sum of N natural numbers.
public class SumOfFirstNNaturalNumber {
    public static void main(String[] args) {

        System.out.print("enter number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int total = sum(number);

        System.out.println(total);
    }

    private static int sum(int i) {
        return i*(i+1) / 2;
    }
}
