package bit;

public class and {

    // Convert integer to binary string (manual)
    static String intToBinary(int num) {
        if (num == 0) return "0";
        String binary = "";
        while (num > 0) {
            binary = (num % 2) + binary;
            num /= 2;
        }
        return binary;
    }

    // Pad two binary strings to equal length
    static String[] padEqual(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        while (lenA < lenB) {
            a = "0" + a;
            lenA++;
        }
        while (lenB < lenA) {
            b = "0" + b;
            lenB++;
        }
        return new String[]{a, b};
    }

    // Perform AND manually on binary strings
    static String binaryAnd(String a, String b) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            result.append((a.charAt(i) == '1' && b.charAt(i) == '1') ? '1' : '0');
        }
        return result.toString();
    }

    // Convert binary string to integer (manual)
    static int binaryToInt(String bin) {
        int value = 0;
        int power = 1;
        for (int i = bin.length() - 1; i >= 0; i--) {
            if (bin.charAt(i) == '1') {
                value += power;
            }
            power *= 2;
        }
        return value;
    }

    // Final method: AND without using &
    static int manualAnd(int a, int b) {
        String binA = intToBinary(a);
        String binB = intToBinary(b);
        String[] padded = padEqual(binA, binB);
        String andResult = binaryAnd(padded[0], padded[1]);
        return binaryToInt(andResult);
    }

    public static void main(String[] args) {
        int a = 5; // 101
        int b = 3; // 011
        System.out.println("Manual AND Result: " + manualAnd(a, b)); // Output: 1
        // a = a^b;
        // b = b^a;
        // a = a^b;
        // System.out.println(a + " " + b);
    }
}

