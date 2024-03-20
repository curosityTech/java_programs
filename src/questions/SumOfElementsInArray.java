package questions;
import java.util.Scanner;

public class SumOfElementsInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter size of an array: ");
        int size = scan.nextInt();

        int[] numbers = new int[size];

        for(int i=0;i<size;i++) {
            System.out.print("enter element " + (i+1) + " :");
            numbers[i] = scan.nextInt();
        }

        int total = 0;
        for(int i=0;i<size;i++) {
            total += numbers[i];
        }

        System.out.println("total sum of the elements: " + total);
    }
}
