/* Row-wise Prime Checker in a Matrix

You are given two integers m and n, followed by m × n integers representing the elements of a matrix. Your task is to check whether each row of the matrix contains at least one prime number.

✅ Conditions
If m ≤ 0 or n ≤ 0 → Output "Wrong Input"
If any matrix element is negative → Output "Wrong Input"
If the number of elements provided is less than m × n → Output "Wrong Input"
If every row contains at least one prime number → Output "Valid"
If even one row does not contain a prime → Output "Not Valid"

📥 Input Format
First line contains two integers m and n — number of rows and columns.
Second line contains m × n space-separated integers representing the matrix elements (row-wise).

📤 Output Format
Print only one of the following:
"Wrong Input"
"Valid"
"Not Valid"

🔍 Definition
A prime number is a natural number greater than 1 that has exactly two distinct positive divisors: 1 and itself.

🧪 Sample Input 1
2 3
2 4 6 7 9 11

✅ Sample Output 1
Valid

Explanation:
Matrix:

2  4  6
7  9 11

Row 1 → Prime: 2
Row 2 → Primes: 7, 11
Every row has at least one prime → Valid

🧪 Sample Input 2
2 2
4 6 8 9

❌ Sample Output 2
Not Valid

Explanation:
No prime number in row 1 → Not Valid

🧪 Sample Input 3
-1 3
2 3 5

⚠️ Sample Output 3
Wrong Input */

import java.util.Scanner;

public class Prime_Checker {

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.print("Wrong Input");
            return;
        }
        int m = sc.nextInt();

        if (!sc.hasNextInt()) {
            System.out.print("Wrong Input");
            return;
        }
        int n = sc.nextInt();

        if (m <= 0 || n <= 0) {
            System.out.print("Wrong Input");
            return;
        }

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!sc.hasNextInt()) {
                    System.out.print("Wrong Input");
                    return;
                }

                matrix[i][j] = sc.nextInt();

                if (matrix[i][j] < 0) {
                    System.out.print("Wrong Input");
                    return;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            boolean hasPrime = false;

            for (int j = 0; j < n; j++) {
                if (isPrime(matrix[i][j])) {
                    hasPrime = true;
                    break;
                }
            }

            if (!hasPrime) {
                System.out.print("Not Valid");
                return;
            }
        }

        System.out.print("Valid");
        
        sc.close();
    }
}