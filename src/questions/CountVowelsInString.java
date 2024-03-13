package questions;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CountVowelsInString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter string: ");
        String s = scan.next();

        scan.close();

        int count = count(s);
        System.out.println("total vowels are: " + count);
    }

    private static int count(String s) {
        String regex = "[aeiouAEIOU]";
        int count=0;

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if(Pattern.matches(regex, Character.toString(ch))) {
                count += 1;
            }
        }
        return count;
    }
}
