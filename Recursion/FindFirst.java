package Recursion;

import java.util.Scanner;

public class FindFirst {
    public static int find1(int arr[],int index,int num){
        if(index == arr.length -1 ){
            return arr.length -1 ;
        }
        if(arr[index] == num){
            return index;
        }

        return find1(arr,index+1,num);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int num = sc .nextInt();
        int arr[] = {1,2,3,4,5,6};
        System.out.println(find1(arr,0,6));
        sc.close();
    }
}


