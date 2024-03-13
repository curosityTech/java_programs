package questions;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CharacterIsAVowelOrConsonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter character: ");
        char letter = scan.next().charAt(0);

        scan.close();

        check(letter);
    }

    private static void check(char letter) {
        // Define the regex pattern for alphabets
        String regex = "[aeiouAEIOU]";

        boolean isCharacterVowel = Pattern.matches(regex, Character.toString(letter));

        if(isCharacterVowel) {
            System.out.println("Character is vowel");
        }
        else{
            System.out.println("Character is consonant");
        }

    }
}
