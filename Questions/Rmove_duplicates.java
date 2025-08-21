package Questions;

import java.util.Scanner;

// rmove duplicates from sorted array
// two pointers approach  

public class Rmove_duplicates {
    public static int count_duplicates(int nums[]){
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[i] < nums[j]){
                int temp = nums[i+1];
                nums[i+1] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i+1;
    }
    public static void main(String args[]){
        int nums [] = {1,3,3,4,4,5,6,7,7,8};
        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < nums.length; i++) {
        //     nums[i] = i; 
        // }
        // sc.close();
        System.out.println(count_duplicates(nums));
    }
}
