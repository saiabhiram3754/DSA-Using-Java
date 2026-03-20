// import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        int target = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                for(int k = j + 1; k < arr.length; k++) {
                    if(arr[i] + arr[j] + arr[k] == target) {
                        System.out.println(arr[i] + ", " + arr[j] + ", " + arr[k]);
                    }
                }
            }
        }

        // threeSum(arr, target);
    }

    // two pointer approach

    // public static void threeSum(int[] arr, int target) {
    //     Arrays.sort(arr);
    //     for (int i = 0; i < arr.length - 2; i++) {
    //         if (i > 0 && arr[i] == arr[i - 1]) continue; // Skip duplicates
    //         int left = i + 1;
    //         int right = arr.length - 1;
    //         while (left < right) {
    //             int sum = arr[i] + arr[left] + arr[right];
    //             if (sum == target) {
    //                 System.out.println(arr[i] + ", " + arr[left] + ", " + arr[right]);
    //                 left++;
    //                 right--;
    //             } else if (sum < target) {
    //                 left++;
    //             } else {
    //                 right--;
    //             }
    //         }
    //     }
    // }
}
