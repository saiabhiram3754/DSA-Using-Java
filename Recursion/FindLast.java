package Recursion;

import java.util.Scanner;

public class FindLast {
    public static int find1(int arr[],int index,int num){
        if(index == 0 ){
            return 0 ;
        }
        if(arr[index] == num){
            return index;
        }

        return find1(arr,index-1,num);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int num = sc .nextInt();
        int arr[] = {1,2,6,6,5,4};
        System.out.println(find1(arr,arr.length - 1,6));
        sc.close();
    }
}