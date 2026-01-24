public class Beautifulsubarray {
    // public static int countBeautifulSubarrays(int[] nums) {
    //     int n = nums.length;
    //     int beautifulCount = 0;

    //     for (int start = 0; start < n; start++) {
    //         int oddCount = 0;
    //         for (int end = start; end < n; end++) {
    //             if ((nums[end] & 1) == 1) {
    //                 oddCount++;
    //             }
    //             if (oddCount % 2 == 0) {
    //                 beautifulCount++;
    //             }
    //         }
    //     }

    //     return beautifulCount;
    // }

    // public static int countBeautifulSubarrays(int[] arr) {
    //     int n = arr.length;
    //     int count = 0;

    //     // Outer loop for starting index
    //     for (int i = 0; i < n; i++) {
    //         int sum = 0;

    //         // Inner loop for ending index
    //         for (int j = i; j < n; j++) {
    //             sum += arr[j];

    //             // Check if sum is even
    //             if (sum % 2 == 0) {
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }


      public static int countBeautifulSubarrays(int[] arr) {
        int prefixSum = 0;
        int evenCount = 1; // empty prefix
        int oddCount = 0;
        int result = 0;

        for (int num : arr) {
            prefixSum += num;

            if (prefixSum % 2 == 0) {
                result += evenCount;
                evenCount++;
            } else {
                result += oddCount;
                oddCount++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int result = countBeautifulSubarrays(nums);
        System.out.println("Number of beautiful subarrays: " + result);
    }
}
