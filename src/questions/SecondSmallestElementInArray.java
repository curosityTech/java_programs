package questions;
import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestElementInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter size of array: ");
        int size = scan.nextInt();

        int[] numbers = new int[size];

        for(int i=0;i<size;i++) {
            System.out.print("enter element " + (i+1) + " :");
            numbers[i] = scan.nextInt();
        }

        // create a copy of an array adn then sort the array
        int[] sortedArray = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(sortedArray);

        System.out.println(sortedArray[1]);
    }
}
