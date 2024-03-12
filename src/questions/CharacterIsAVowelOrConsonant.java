package questions;
import java.util.Scanner;

public class CharacterIsAVowelOrConsonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter character: ");
        char letter = scan.next().charAt(0);

        scan.close();

        check(letter);
    }

    private static void check(char letter) {
        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
            System.out.println("Character is vowel");
        }

        else{
            System.out.println("Character is consonant");
        }
    }
}
