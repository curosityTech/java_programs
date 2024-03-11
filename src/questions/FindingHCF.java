package questions;
import java.util.Scanner;
import static java.lang.Math.min;

public class FindingHCF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter first number: ");
        int a = scan.nextInt();

        System.out.print("enter second number: ");
        int b = scan.nextInt();

        int hcf = print(a, b);
        System.out.println(hcf);
    }

    private static int print(int a, int b) {
        int hcf = 0;

        int minValue = min(a, b);

        for(int i=1; i<= minValue; i++) {
            if(a%i==0 && b%i==0) {
                hcf = i;
            }
        }
        return hcf;
    }
}
