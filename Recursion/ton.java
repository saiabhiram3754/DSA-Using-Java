package Recursion;

import java.util.Scanner;

public class ton {
    public static void toon (int num){
        if (num == 1){
            System.out.println(num);
            return ;
        }
        toon(num-1);
        System.out.println(num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num = sc .nextInt();
        // int arr[] = {1,2,3,6,5,6};
        toon(5);
        sc.close();
    }
}
       

