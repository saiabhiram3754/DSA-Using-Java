package bit;

import java.util.Scanner;

public class num_in_two_power {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc .nextInt();
        
        // int i=0;
        // boolean ispower = false;
        // for(;Math.pow(2, i) <= num;){
        //     int value  = (int)Math.pow(2, i);
        //     if( value == num){
        //         ispower = true;
        //         System.out.println(i);
        //         break;
        //     }
        //    i++;
        // }
        // if (ispower){
        //     System.out.println(num +"is found");
        // }
        // else{
        //     System.out.println(num + " not found");
        // }



        // using binary operations
 
        // System.out.println(ispoewroftwo(num));
        System.out.println(setithbit(num,2));
        sc.close();
    }
    
        public static boolean ispoewroftwo(int num){
            return ((num&num-1) == 0);
        }
        public static int setithbit(int num,int i){
            int bitmask = 1<<i;
            return (num|bitmask);
        }
}
