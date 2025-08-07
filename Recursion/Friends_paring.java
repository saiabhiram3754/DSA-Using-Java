package Recursion;

import java.util.Scanner;

public class Friends_paring{

    public static int friendsparing(int num){
        if( num == 1 || num == 2){
            return num;
        }

        //single
        int fnm1 = friendsparing(num - 1);
        // paring
        int  fnm2 = friendsparing(num - 2);
        int pairways = (num-1) *  fnm2;
        
        int total_ways = fnm1 + pairways;

        return total_ways;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(friendsparing(a));
        sc.close();

    }
}