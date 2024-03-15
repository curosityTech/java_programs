package questions;
import java.util.Scanner;

/* n Java, toCharArray() is a method available in the String class. It converts a string into a character array.
When you call toCharArray() on a String, it returns an array of characters containing the characters of the original string in the same order.
Each character of the string corresponds to an element in the character array.
 */

// scan.next() to read the input string, which reads only one token (word) from the input. If the input string contains spaces, it will only read the characters before the first space.
public class LengthOfString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter string: ");
        String s = scan.nextLine();

        int length = length(s);
        System.out.print("length is: " + length);
    }

    private static int length(String s) {
         int length = 0;

        // Convert the string to a character array
        char[] charArray = s.toCharArray();

        for(int i=0; i<charArray.length; i++ ) {
            length += 1;
        }

        return length;
    }
}
