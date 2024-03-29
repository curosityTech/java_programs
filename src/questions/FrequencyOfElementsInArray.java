package questions;
import java.util.ArrayList;
import java.util.HashMap;
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

        processUsingList(size, numbers);
        processUsingHashMap(numbers);

    }

    private static void processUsingList(int size, int[] numbers) {
        List<Integer> list = new ArrayList<>();

        System.out.println("answer using list method: ");
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

    private static void processUsingHashMap(int[] numbers) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for(int element : numbers) {
            if(frequencyMap.containsKey(element)) {
                frequencyMap.put(element, frequencyMap.get(element)+1);
            }
            else {
                frequencyMap.put(element, 1);
            }
        }

        System.out.println();
        System.out.println("answer using hashMap method: ");
        for(int key : frequencyMap.keySet()) {
            System.out.println(key + " appears " + frequencyMap.get(key) + " times");
        }

    }
}
