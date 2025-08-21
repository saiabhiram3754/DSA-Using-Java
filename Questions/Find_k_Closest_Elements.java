package Questions;

import java.util.ArrayList;
import java.util.List;

public class Find_k_Closest_Elements {
    public static List<Integer> findClosestElements(int arr[],int k,int x){
        int left = 0;
        int right = arr.length -1;
        while(right - left +1 > k){
            if(Math.abs(arr[left] - x) > Math.abs(arr[right -x])){
                left ++;
            } else {
                right --;
            }
        }
        
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            result.add(arr[i]);
        }
        return result;
    }
    public static void main(String []args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int k = 4;
        int x = 3;

        List<Integer> ans = findClosestElements(arr, k, x);
        System.out.println(ans);
    }
}

// Binary Search + Two Pointers

// public class KClosestElementsBinary {
//     public static List<Integer> findClosestElements(int[] arr, int k, int x) {
//         int left = 0, right = arr.length - 1;

//         while (right - left >= k) {
//             if (Math.abs(arr[left] - x) > Math.abs(arr[right] - x)) {
//                 left++;
//             } else {
//                 right--;
//             }
//         }

//         List<Integer> result = new ArrayList<>();
//         for (int i = left; i <= right; i++) {
//             result.add(arr[i]);
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         int k = 4, x = 6;

//         List<Integer> ans = findClosestElements(arr, k, x);
//         System.out.println(ans); 
//     }
// }
