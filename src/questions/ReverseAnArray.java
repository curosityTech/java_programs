package questions;
import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter the size of the array: ");
        int size = scan.nextInt();

        int[] numbers = new int[size];

        for(int i=0;i<size;i++) {
            System.out.print("enter element " + (i+1) + " : ");
            numbers[i] = scan.nextInt();
        }

        for(int i=size-1;i>=0;i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
