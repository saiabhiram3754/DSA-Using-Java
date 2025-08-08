package BitManuplication;
import java.util.Scanner;

public class xor {
    
    // Convert integer to binary string
    public static String tobinary(int num){
        String binnum = "";
        while(num > 0){
            binnum = (num % 2) + binnum;
            num = num / 2;
        }
        return binnum.isEmpty() ? "0" : binnum;
    }

    // Equalize lengths of two binary strings
    public static String[] equal(String s1, String s2){
        int lenA = s1.length();
        int lenB = s2.length();
        while(lenA < lenB){
            s1 = "0" + s1;
            lenA++;
        }
        while(lenA > lenB){
            s2 = "0" + s2;
            lenB++;
        }
        return new String[]{s1, s2};
    }

    // Perform XOR on two binary strings
    public static String binaryxor(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < s1.length()){
            if(s1.charAt(i) != s2.charAt(i)){
                sb.append("1");
            } else {
                sb.append("0");
            }
            i++;
        }
        return sb.toString();
    }

    // Convert binary string to decimal integer
    public static int Tobinary(String s1){
        int result = 0;
        int power = 1;

        for(int j = s1.length() - 1; j >= 0; j--){
            if(s1.charAt(j) == '1'){
                result += power;
            }
            power *= 2;
        }
        return result;
    }

    // Compute XOR of two integers and return binary string
    public static String result(int num1, int num2){
        String binA = tobinary(num1);
        String binB = tobinary(num2);
        String[] equalStrings = equal(binA, binB);
        String xorResult = binaryxor(equalStrings[0], equalStrings[1]);
        return xorResult;
    }

    // Alternate version: return decimal value of XOR
    public static int resultAsInt(int num1, int num2){
        String binXor = result(num1, num2);
        return Tobinary(binXor);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // To print binary result of XOR
        System.out.println("Binary XOR: " + result(num1, num2));

        // To print decimal result of XOR
        System.out.println("Decimal XOR: " + resultAsInt(num1, num2));
        sc.close();
    }
}
