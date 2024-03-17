package questions;
import java.util.Scanner;

public class CapitalizeFirstAndLastCharacterInString {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

        System.out.print("enter string: ");
        String s = scan.nextLine();

        StringBuilder toggleString = toggleString(s);
        System.out.println(toggleString);
    }

    private static StringBuilder toggleString(String s) {
        StringBuilder s1 = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(i==0 || i==s.length()-1) {
                ch=Character.toUpperCase(ch);
                s1.append(ch);
            }
            else s1.append(ch);
        }
        return s1;
    }
}
