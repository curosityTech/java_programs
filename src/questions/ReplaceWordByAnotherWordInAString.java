package questions;
import java.util.Scanner;

public class ReplaceWordByAnotherWordInAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter string: ");
        String s = scan.nextLine();

        System.out.print("word to replace: ");
        String s1 = scan.nextLine();

        System.out.print("replaced word: ");
        String s2 = scan.nextLine();

        String replacedString = replacedString(s, s1, s2);
        System.out.println(replacedString);
    }

    private static String replacedString(String s, String s1, String s2) {
        return s.replace(s1, s2);
    }
}
