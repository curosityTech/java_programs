package questions;
import java.util.Scanner;

/* In Java, strings are immutable, meaning once created, their values cannot be changed.
When you perform string concatenation using the + operator inside a loop, a new string object is created each time the concatenation occurs.
This can be inefficient, especially in large loops, as it can lead to a large number of temporary string objects being created, which can impact performance.

To mitigate this performance issue, you can use StringBuilder class, which provides a more efficient way to concatenate strings, particularly in loops.
 */

public class ToggleCharacterInString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter string: ");
        String s1 = scan.next();

        StringBuilder toggleString = toggle(s1);
        System.out.println("toggle string: " + toggleString);

    }

    private static StringBuilder toggle(String s1) {
        StringBuilder s2 = new StringBuilder();

        for(int i=0; i<s1.length(); i++) {
            char ch = s1.charAt(i);
            if(Character.isUpperCase(ch)) {
                ch=Character.toLowerCase(ch);
                s2.append(ch);
            }
            else {
                ch=Character.toUpperCase(ch);
                s2.append(ch);
            }
        }
        return s2;
    }
}
