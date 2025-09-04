import java.util.Scanner;

public class NumberOperations {

    // 1. Reverse a number
    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    // 2. Check Palindrome
    public static boolean isPalindrome(int number) {
        return number == reverseNumber(number);
    }

    // 3. Sum of digits
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    // 4. Product of digits
    public static int productOfDigits(int number) {
        int product = 1;
        while (number != 0) {
            product *= number % 10;
            number /= 10;
        }
        return product;
    }

    // 5. Count digits
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // 6. Largest digit
    public static int largestDigit(int number) {
        int maxDigit = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            number /= 10;
        }
        return maxDigit;
    }

    // 7. Armstrong check
    public static boolean isArmstrong(int number) {
        int original = number;
        int digits = countDigits(number);
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }
        return sum == original;
    }

    // ============================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("\nChoose an operation:");
        System.out.println("1. Reverse the number");
        System.out.println("2. Check Palindrome");
        System.out.println("3. Sum of digits");
        System.out.println("4. Product of digits");
        System.out.println("5. Count digits");
        System.out.println("6. Largest digit");
        System.out.println("7. Check Armstrong number");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Reversed: " + reverseNumber(num));
        } else if (choice == 2) {
            System.out.println(isPalindrome(num) ? "Palindrome" : "Not Palindrome");
        } else if (choice == 3) {
            System.out.println("Sum of digits: " + sumOfDigits(num));
        } else if (choice == 4) {
            System.out.println("Product of digits: " + productOfDigits(num));
        } else if (choice == 5) {
            System.out.println("Count of digits: " + countDigits(num));
        } else if (choice == 6) {
            System.out.println("Largest digit: " + largestDigit(num));
        } else if (choice == 7) {
            System.out.println(isArmstrong(num) ? "Armstrong number" : "Not Armstrong");
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
