import java.util.Scanner;

public class RemoveConsecutive {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        sb.append(num.charAt(0));

        for (int i = 1; i < num.length(); i++) {
            if (num.charAt(i) != num.charAt(i - 1)) {
                sb.append(num.charAt(i));
            }
        }

        System.out.println(sb.toString());
                
        sc.close();
    }

    // public static void main(String[] args) {

    //     Scanner sc = new Scanner(System.in);
    //     String num = sc.nextLine();

    //     if (num.length() == 0) {
    //         System.out.println("");
    //         return;
    //     }

    //     String result = "";
    //     result += num.charAt(0);  // add first character

    //     for (int i = 1; i < num.length(); i++) {

    //         if (num.charAt(i) != num.charAt(i - 1)) {
    //             result += num.charAt(i);
    //         }
    //     }

    //     System.out.println(result);
    // }
}