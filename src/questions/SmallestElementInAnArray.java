package questions;
import java.util.Scanner;

public class SmallestElementInAnArray  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter the size of array: ");
        int size = scan.nextInt();

        // Declaration and creation of an array
        int[] numbers = new int[size];

        // enter elements in the array
        for(int i=0;i<size;i++) {
            System.out.print("enter element " + (i+1) + " :");
            numbers[i] = scan.nextInt();
        }

        int smallest = numbers[0];

        for(int i=1;i<size;i++) {
            if(numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.print("smallest among the numbers present in an array: " + smallest);
    }
}
