package questions;
import java.util.Scanner;

public class ReplaceSubtringInAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter string: ");
        String s = scan.nextLine();

        System.out.print("enter substring to replace: ");
        String s1 = scan.nextLine();

        System.out.print("enter replacement string: ");
        String s2 = scan.nextLine();

        String replacedString = replacedString(s, s1, s2);
        System.out.println("replaced string: " + replacedString);
    }

    private static String replacedString(String s, String s1, String s2) {
        return s.replace(s1, s2);
    }
}
