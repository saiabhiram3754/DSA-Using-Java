package Patterns;
import java.util.*;

public class Shapes {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Square
        for(int i = 1; i <= n; i++) {  // i = rows(5) 
            for(int j = 1; j <= n; j++) {  // j = columns(5)
                System.out.print("* ");
            }
            System.out.println();
        }

        // Rectangle
        for(int i = 1; i <= n; i++){  // i = rows(5)
            for(int j = 1; j <= 3; j++) {   // j = columns(3)
                System.out.print("* ");
            }
            System.out.println();
        }

        // Right Angled Triangle
        // type 1
        for(int i = 1; i <= n; i++) {  // i = rows(5)
            for(int j = 1; j <= i; j++) {  // j = columns(1,2,3,4,5)
                System.out.print("* ");
            }
            System.out.println();
        }

        // type 2
        for(int i = 1; i <= n; i++) {     // for(int i = n; i <= 1; i--);
            for (int j = 1; j <= 6-i ; j++) {   // for((int j = 1 ; j <= i; j++));
                System.out.print("* ");
            }
            System.out.println();
        }

        // type 3 
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for(int j = i ; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // type 4
       for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //  Upper triangle
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // below Triangle
        for(int i = n; i >= 1; i--){
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // rhombus
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        for(int i = n-1; i >= 1; i--){
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

/* 
    1
   232
  34543
 4567654
567898765
 */

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i + j);
            }
            for (int j = i - 2; j >= 0; j--) {
                System.out.print(i + j);
            }
            
            System.out.println();
        }

        // Hollow Square
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if( i ==1 || i == n || j==1 || j==n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Hollow Right -Angled Triangle 
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                if( i == 1|| i == n || j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Primes in Half Right-Angled Triangle
        int p = 2; // starting number to check for primes

        // Half right-angled triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // Only print primes at borders
                if (i == 1 || i == n || j == 1 || j == i) {
                    p = nextPrime(p); // get next prime
                    System.out.print(p + " ");
                    p++;
                } else {
                    System.out.print("  "); // space inside
                }
            }
            System.out.println();
        }
        sc.close();
    }
        

    static int nextPrime(int num) {
        while (true) {
            int fc = 0; // factor count
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    fc++;
                }
            }
            if (fc == 2) { // prime has exactly 2 factors
                return num;
            }
            num++;
        }
    }
}
