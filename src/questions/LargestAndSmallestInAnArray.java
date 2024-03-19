package questions;
import java.util.Scanner;

public class LargestAndSmallestInAnArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print(" enter the size of the array: ");
        int size = scan.nextInt();

        // Declaration and creation of an array
        int[] numbers = new int[size];

        // enter elements in an array
        for(int i=0;i<size;i++) {
            System.out.print("enter element " + (i+1) +" :");
            numbers[i] = scan.nextInt();
        }

        int largest=0, smallest=numbers[0];

        // process to select the largest from the array
        for(int i=0;i<size;i++) {
            if(numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        // process to select the smallest from the array
        for(int i=1;i<size;i++) {
            if(numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("largest among the elements present in the array: " + largest);
        System.out.println("smallest among the elements present in the array: " + smallest);
    }
}
