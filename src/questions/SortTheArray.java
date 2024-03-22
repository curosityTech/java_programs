package questions;
import java.util.Arrays;
import java.util.Scanner;

/* The Arrays.copyOf() method is used to create a copy of an array with a specified length.
It allows you to create a new array that contains all the elements of the original array, up to the specified length.
If the specified length is greater than the length of the original array, the remaining elements of the new array are filled with default values
(0 for numeric types, false for boolean, and null for reference types).
 */

public class SortTheArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter size of an array: ");
        int size = scan.nextInt();

        int[] numbers = new int[size];

        for(int i=0;i<size;i++) {
            System.out.print("enter element " + (i+1) + " : ");
            numbers[i] = scan.nextInt();
        }

        int[] reverseArray = Arrays.copyOf(numbers, size);
        Arrays.sort(reverseArray);

        for(int i=0;i<size;i++) {
            System.out.println(reverseArray[i]);
        }
    }
}
