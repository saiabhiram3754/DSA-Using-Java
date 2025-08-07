package Recursion;

import java.util.Scanner;

public class sum_elements {

    public static int sum_element(int num){
        if(num == 1){
            return 1;
        }
        return num + sum_element(num-1);
    }
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc .nextInt();
        System.out.println(sum_element(num));
        sc.close();
    }
}
