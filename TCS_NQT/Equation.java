/*Example

Input:

5 7

Output:

186 */

import java.util.Scanner;

public class Equation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int m = solve(a);
        int n = solve(b);
        
        System.out.println((m * n) - 1);

        sc.close();
    }

    public static int solve(int n) {

        int fc = 0;
        int c = 0;

        for (int i = 2; c < n; i++) {   

            fc = 0;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    fc++;
                    break;
                }
            }

            if (fc == 0) {
                c++;
            }
            if (c == n) {
                return i;
            }
        }

        return -1;   
    }
}