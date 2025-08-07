package Recursion;

import java.util.Scanner;

public class Tilling_Problem {
    public static int tilling(int n){
        if( n ==0 || n ==1){
            return 1;
        }
        //vertical
        int fnm1 = tilling(n-1);

        //horizontal 
        int fnm2 = tilling(n-2);

        return fnm1 + fnm2;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc .nextInt();
        System.out.println(tilling(num));
        sc.close();
    }
}
