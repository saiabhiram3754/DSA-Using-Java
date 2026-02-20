import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter strings : ");

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if(str1.length() == str2.length()) {
            
            str1 = sort(str1);
            str2 = sort(str2);

            if(str1.equals(str2)) {
                System.out.println("The strings are anagrams.");
            } else {
                System.out.println("The strings are not anagrams.");
            }
        } 
        else {
            System.out.println("The strings are not anagrams.");
        }

        sc.close();
    }

    public static String sort(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
