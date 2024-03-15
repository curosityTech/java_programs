package questions;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RemoveVowelsFromString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter string: ");
        String s = scan.next();

        scan.close();

        StringBuilder toggleString = toggle(s);
        System.out.println("toggle string: " + toggleString);

        String replaceString = replace(s);
        System.out.println("replace string: " + replaceString);
    }


    private static StringBuilder toggle(String s) {
        StringBuilder s2 = new StringBuilder();
        String regex = "[aeiouAEIOU]";

        for(int i=0; i<s.length(); i++) {
            char ch  = s.charAt(i);
            if(!Pattern.matches(regex, Character.toString(ch))) {
                s2.append(ch);
            }
        }
        return s2;
    }

    private static String replace(String s) {
        return s.replaceAll("[aeiouAEIOU]", "");
    }
}
