package questions;
import java.util.Scanner;
import java.util.regex.Pattern;

/* To create a regular expression (regex) in Java, you typically use the Pattern class from the java.util.regex package.
 You define a regex pattern as a string, and then compile it into a Pattern object. You can then use this Pattern object
 to match against input strings using Matcher objects.
 */


public class CharacterIsAlphabetOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter character: ");
        char letter = scan.next().charAt(0);

        scan.close();

        check(letter);
    }

    private static void check(char letter) {
        // Define the regex pattern for alphabets
        String regex = "[a-zA-Z]";

        boolean isCharacterAlphabet = Pattern.matches(regex, Character.toString(letter));

        if(isCharacterAlphabet) {
            System.out.println("character is an alphabet");
        }
        else {
            System.out.println("character is not an alphabet");
        }
    }

}
