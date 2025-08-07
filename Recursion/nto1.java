package Recursion;

import java.util.Scanner;

public class nto1 {
    public static int ntofirst(int num){
        if( num == 1){
            System.out.println(num);
            return 1;
        }
        System.out.print(num);
        return ntofirst(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num  =  sc.nextInt();
        ntofirst(num);
        sc.close();
    }
}
