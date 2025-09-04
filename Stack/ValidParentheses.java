import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        // Create a stack to store opening brackets
        Stack<Character> stack = new Stack<>();

        // Loop through every character in the string
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);  // get the i-th character

            //  If it's an opening bracket → push into stack
            if (current == '(' || current == '{' || current == '[') {
                // System.out.println("Pushed " + current + " into stack.");
                stack.push(current);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check if they match
                if ((current == ')' && top != '(') ||
                    (current == '}' && top != '{') ||
                    (current == ']' && top != '[')) {
                    System.out.println("Not valid str");
                    return false;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("VALID string!");
            return true;
        } else {
            System.out.println("INVALID!");
            return false;
        }
    }

    public static void main(String[] args) {
        // Test only a single string
        Scanner sc = new Scanner(System.in);
        String test = sc.next();

        System.out.println(test);
        
        boolean result = isValid(test);
        System.out.println("Final Result: " + result);
    }
}
