import java.util.Scanner;

public class anagram {

    public static String removeSpaces(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != ' ') {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static String toLowerCaseManual(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32); 
            }
            result.append(ch);
        }
        return result.toString();
    }

    public static boolean areAnagrams(String str1, String str2) {
        
        str1 = removeSpaces(str1);
        str2 = removeSpaces(str2);

        str1 = toLowerCaseManual(str1);
        str2 = toLowerCaseManual(str2);

       
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] count = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            count[str2.charAt(i)]--;
        }
       
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter the first string: ");
        String input1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String input2 = sc.nextLine();

        
        if (areAnagrams(input1, input2)) {
            System.out.println(" The strings are anagrams.");
        } else {
            System.out.println(" The strings are not anagrams.");
        }

        sc.close();
    }
}
