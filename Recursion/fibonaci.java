package Recursion;

import java.util.Scanner;

public class fibonaci {
    public static int fib(int num){

        if(num == 1 || num == 0){
            return num;
        } 
        int fn1  = fib(num-1);
        int fn2  = fib(num -2); 
        int fn  = fn1 + fn2;
        return fn;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int num = sc .nextInt();
        // int arr[] = {1,2,3,6,5,6};
        System.out.println(fib(1));
        sc.close();
    }
}
