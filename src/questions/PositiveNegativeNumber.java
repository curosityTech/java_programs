package questions;

import java.util.Scanner;

public class PositiveNegativeNumber {
    public static void main(String[] args) {

        System.out.print("enter number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("number is positive");
        }

        else if (number < 0) {
            System.out.println("number is negative");
        }

        else{
            System.out.println("number is zero");
        }

    }
}