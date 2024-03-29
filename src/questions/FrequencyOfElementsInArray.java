package questions;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FrequencyOfElementsInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter size of an array: ");
        int size = scan.nextInt();

        int[] numbers = new int[size];

        // enter elements in an array
        for(int i=0; i<size; i++) {
            System.out.print("enter " + (i+1) + " element: ");
            numbers[i] = scan.nextInt();
        }

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < size; i++) {
            int elementToCheck = numbers[i];
            int count = 0;

            if (!list.contains(elementToCheck)) {
                for (int j = i; j < size; j++) {
                    if (numbers[j] == elementToCheck) {
                        count++;
                    }
                }
                list.add(elementToCheck);
                System.out.println(elementToCheck + " appears " + count + " times.");
            }
        }
    }
}
