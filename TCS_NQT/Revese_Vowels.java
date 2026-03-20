import java.util.*;

public class Revese_Vowels {
    public static void main(String[] args) {
        System.out.println("Enter the String :");
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {

            // Move i forward until vowel found
            while (i < j && !isVowel(sb.charAt(i))) {
                i++;
            }

            // Move j backward until vowel found
            while (i < j && !isVowel(sb.charAt(j))) {
                j--;
            }

            // Swap vowels
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);

            i++;
            j--;
        }

        sc.close();
        System.out.println(sb);
    }

    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}