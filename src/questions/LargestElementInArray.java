package questions;

import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {
        int largest = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("enter array size: ");
        int size = scan.nextInt();

        // Declaration and creation of array
        int[] numbers = new int[size];

        // enter elements in an array
        for(int i=0;i<size;i++) {
            System.out.print("enter element " + (i+1 ) + ": ");
            numbers[i] = scan.nextInt();
        }

        for(int i=0;i<size;i++) {
            if(numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("largest among the numbers present in an array is: " + largest);
    }
}
