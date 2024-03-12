package questions;
import java.util.Scanner;
import static java.lang.Math.max;

public class FindingLCM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter first number: ");
        int a = scan.nextInt();

        System.out.print("enter second number: ");
        int b = scan.nextInt();

        scan.close();

        int lcm = print(a, b);
        System.out.println(lcm);
    }

    private static int print(int a, int b) {
        int lcm = 0;
        int max = max(a, b);

        // LCM will atleast be >= max(num1, num2)
        // Largest possibility of LCM will be num1*num2

        for(int i=max; i<=a*b; i++) {
            if(i%a==0 && i%b==0) {
                lcm = i;
                break;
            }
        }
        return lcm;
    }
}


