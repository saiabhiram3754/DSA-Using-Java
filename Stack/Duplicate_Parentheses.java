import java.util.Stack;

public class Duplicate_Parentheses {

    public static boolean hasDuplicateParentheses(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // if not closing bracket, push
            if (ch != ')') {
                s.push(ch);
            } else {
                int count = 0;

                // pop until '('
                while (!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }

                // pop the opening '('
                if (!s.isEmpty()) {
                    s.pop();
                }

                // if nothing or only one element inside, duplicate
                if (count < 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b)+(c+d))";
        System.out.println(hasDuplicateParentheses(str)); // false

        String str2 = "((a+b))";
        System.out.println(hasDuplicateParentheses(str2)); // true
    }
}
