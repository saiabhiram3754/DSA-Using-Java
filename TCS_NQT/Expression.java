import java.util.*;

// 1/2 + 1/3 = 5/6;

public class Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();  // number of terms

        int a = Integer.parseInt(s.substring(0, s.indexOf("/")));
        int b = Integer.parseInt(s.substring(s.indexOf("/") + 1, s.indexOf("+")));
        int c = Integer.parseInt(s.substring(s.indexOf("+") + 2, s.lastIndexOf("/")));              
        int d = Integer.parseInt(s.substring(s.lastIndexOf("/") + 1));

        int numerator = a * d + c * b;
        int denominator = b * d;
        System.out.println(numerator + "/" + denominator);

        sc.close();
    }
}
