import java.util.*;

public class contains_Duplicates{ 
    
    // public static boolean Duplicates(int[] nums){   O(n^2)
    //     for(int i = 0; i< nums.length -1; i++){
    //         for(int j = i+1; j<nums.length; j++){
    //             if(nums[i] == nums[j]){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    public static boolean Duplicates(int[] nums){  // O(n)
        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i< nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String [] arrgs){
        int nums[] = {2,3,3,4,5,6,7,8};
        System.out.print(Duplicates(nums));
    }
}


// import java.util.*;

// class contains_Duplicates {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 2, 4, 5, 1};
//         Set<Integer> seen = new HashSet<>();
//         Set<Integer> duplicates = new HashSet<>();

//         for (int num : arr) {
//             if (!seen.add(num)) {
//                 duplicates.add(num);
//             }
//         }

//         System.out.println(duplicates); // [1, 2]
//     }
// }