/* TCS NQT Model Question

📊 Problem: Calculate Standard Deviation

Write a program to calculate the Standard Deviation of a given set of 5 integers.
Standard Deviation is a measure of how spread out numbers are from their average (mean).

📘 Formula Used

Mean (μ)
Variance (σ²)
Standard Deviation (σ)

Where N = 5

📥 Input Format
The user enters 5 integer values

📤 Output Format
Display the Standard Deviation of the given numbers

🧪 Sample Input
Enter 5 numbers:
10
12
23
23
16

✅ Sample Output
Standard Deviation is: 5.0

*/

import java.util.Scanner;

public class Std_Deviation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int [5];
        System.out.println("Enter 5 numbers: ");
        
        for( int i =0 ; i < 5; i++) {
            a [i]= sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < 5; i++) {
            sum = sum + a[i];
        }
        int mean = sum / a.length;
        double num= 0;

        for(int i = 0 ; i < 5 ; i++) {
            num = num + Math.pow((a[i] - mean), 2);
        }

        int varience;
        varience = (int)(num / a.length);

        double std_deviation = Math.sqrt(varience);
        System.out.println("Standard Deviation is: %.4f " + (float) std_deviation);
        sc.close();
    }
}