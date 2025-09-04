public class ReverseNumber {
    public static int reverse(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;       // extract last digit
            reversed = reversed * 10 + digit; // add digit to reversed
            number /= 10;                  // remove last digit
        }

        return reversed;
    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Original: " + num);
        System.out.println("Reversed: " + reverse(num));
    }
}
