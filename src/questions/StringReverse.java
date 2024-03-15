package questions;
import java.util.Scanner;

// scan.next() to read the input string, which reads only one token (word) from the input. If the input string contains spaces, it will only read the characters before the first space.
public class StringReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter string: ");
        String s = scan.nextLine();

        StringBuilder s1 = reverse(s);
        System.out.println("reverse string: " + s1);
    }

    private static StringBuilder reverse(String s) {
        StringBuilder s2 = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            s2.insert(0,ch);
        }
        return s2;
    }
}
