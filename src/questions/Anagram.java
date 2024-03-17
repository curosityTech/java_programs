package questions;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter string s1: ");
        String s1 = scan.next();

        System.out.print("enter string s2: ");
        String s2 = scan.next();

        anagram(s1, s2);
    }

    private static void anagram(String s1, String s2){
        int length;
        boolean isAnagram = true;
        if(s1.length() != s2.length()) {
            System.out.println("string is not anagram");
        }
        else {
            length = s1.length();

            String s1Sorted = sort(s1);
            String s2Sorted = sort(s2);

            for(int i=0; i<length-1; i++) {
                if(s1Sorted.charAt(i) != s2Sorted.charAt(i)) {
                    isAnagram = false;
                    break;
                }
            }

            if(isAnagram) {
                System.out.println("String is Anagram");
            }
            else {
                System.out.println("String is not Anagram");
            }

        }
    }

    private static String sort(String s) {
        // Convert the string to a character array
        char[] charArray = s.toCharArray();

        // Sort the character array
        Arrays.sort(charArray);

        // Convert the sorted character array back to a string
        return new String(charArray);
    }
}
