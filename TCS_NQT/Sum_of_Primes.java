/* TCSS NQT Model Question
🧮 Problem: Sum of a Range of Prime Numbers

A prime number is a natural number greater than 1 that has exactly two distinct positive divisors: 1 and itself.
You are given two integers:
A → the starting position in the sequence of prime numbers
B → the number of consecutive prime numbers to be considered from that position
Your task is to find the sum of B consecutive prime numbers starting from the A-th prime number.

📥 Input Format

First line contains an integer A
Second line contains an integer B

📤 Output Format

Print a single integer — the sum of the required prime numbers

🔍 Explanation

Prime numbers in order:
2, 3, 5, 7, 11, 13, 17, 19, ...

If:
A = 3
B = 4

Start from 3rd prime → 5
Take 4 primes → 5, 7, 11, 13
Sum = 5 + 7 + 11 + 13 = 36

🧪 Sample Input
3
4

✅ Sample Output
36

*/

import java.util.Scanner;

public class Sum_of_Primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // starting prime position
        int b = sc.nextInt();  // number of primes to include

        int end = a + b;  // last prime position
        int sum = 0;
        int count = 0;    // prime counter

        for (int i = 2; count <= end; i++) {
            int factors = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    factors++;
                }
            }

            // Check prime AFTER counting factors
            if (factors == 2) {
                count++;

                if (count >= a && count <= end) {
                    sum += i;
                }
            }
        }

        System.out.println(sum);
        sc.close();
    }
}
