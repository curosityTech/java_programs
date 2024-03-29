package questions;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class PrimeFactorsOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter number: ");
        int number = scan.nextInt();

        primeFactors(number);
    }

    private static void primeFactors(int number) {
         for(int i=2; i<=number; i++) {
             boolean isPrime = true;
             if(number%i == 0) {
                 for (int j=2; j<=sqrt(i); j++) {
                     if(i%j==0) {
                         isPrime = false;
                         break;
                     }
                 }

                 if(isPrime) {
                     System.out.println(i);
                 }
             }
         }
    }
}
