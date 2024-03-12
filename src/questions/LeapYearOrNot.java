package questions;
import java.util.Scanner;
public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter year: ");

        int year = scan.nextInt();

        scan.close();

        check(year);

    }

    private static void check(int year) {
        if (year%400 == 0 || (year%4 == 0 && year%100 != 0)) {
            System.out.println("It is a leap year");
        }
        else {
            System.out.println("year is not a leap year");
        }
    }
}
