package Recursion;

import java.util.*;

public class power_n {
    public static int pow_n(int num,int power){
        if (power == 0){
            return 1;
        }
        int halfpower = pow_n(num, power/2);
        int halfpowers = halfpower * halfpower;
        if (power%2 == 1){
            return num *halfpowers;
        }
        else {
            return halfpowers;
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int power = sc.nextInt();
        System.out.println(pow_n(n, power));
        sc.close();
    }
}
