package questions;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SumOfNumbersInString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter string: ");
        String s = scan.nextLine();

        int total = sum(s);
        System.out.println("total sum of numbers present in string: " + total);
    }

    private static int sum(String s) {
        int total=0;
        String regex = "[0-9]";

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(Pattern.matches(regex, Character.toString(ch))) {
                // For each character that matches the regex pattern, its numeric value is obtained using Character.getNumericValue() and added to the total.
                total += Character.getNumericValue(ch);
            }
        }
        return total;
    }
}
