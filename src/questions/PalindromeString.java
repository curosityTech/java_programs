package questions;
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter string: ");
        String s = scan.next();

        scan.close();

        check(s);
    }

    private static void check(String s) {
        StringBuilder s2 = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            s2.insert(0, ch);
        }

        boolean isEqual = s.contentEquals(s2);

        if(isEqual) {
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }
    }
}
