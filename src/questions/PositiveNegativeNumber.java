package questions;

import java.util.Scanner;

public class PositiveNegativeNumber {
    public static void main(String[] args) {

        System.out.print("enter number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        input.close();

        check(number);
    }

    private static void check(int num) {
        if (num > 0) {
            System.out.println("number is positive");
        }

        else if (num < 0) {
            System.out.println("number is negative");
        }

        else{
            System.out.println("number is zero");
        }
    }
}