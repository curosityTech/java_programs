package questions;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RemoveCharacterExceptAlphabetsFromString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter string: ");
        String s = scan.next();

        StringBuilder toggleString = toggleString(s);
        System.out.println("toggle string: " + toggleString);

        String replaceString = replace(s);
        System.out.println("replace string: " + replaceString);

    }

    private static StringBuilder toggleString(String s) {
        String regex = "[a-zA-Z]";

        StringBuilder s1 = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(Pattern.matches(regex, Character.toString(ch))) {
                s1.append(ch);
            }
        }
        return s1;
    }

    private static String replace(String s) {
        // ^ inside the square brackets [] represents negation, matching any character not in the specified range.
        return s.replaceAll("[^a-zA-Z]", "");
    }
}
