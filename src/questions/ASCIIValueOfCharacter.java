package questions;
import java.util.Scanner;

/* In Java, when you perform arithmetic operations on a char, it's automatically promoted to an int type.
Hence, the explicit casting from char to int is indeed redundant.
You can directly assign the char value to an int variable without casting.
 */

public class ASCIIValueOfCharacter {
    public static void main(String[] args) {
        int asciiValue;
        Scanner scan = new Scanner(System.in);

        System.out.print("enter character: ");
        char value = scan.next().charAt(0);

        scan.close();

        asciiValue = value;

        System.out.println(asciiValue);
    }
}
