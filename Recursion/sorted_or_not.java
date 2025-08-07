package Recursion;

import java.util.Scanner;

    public class sorted_or_not {

        public static boolean sortedRecursive(int arr[], int index) {
            if (index == arr.length -1) {
                return true;
            }
        
            if (arr[index] > arr[index + 1]) {
                return false;
            }

        return sortedRecursive(arr, index + 1);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int num = sc .nextInt();
        int arr[] = {1,2,3,4,5,6};
        System.out.println(sortedRecursive(arr,0));
        sc.close();
    }
}
