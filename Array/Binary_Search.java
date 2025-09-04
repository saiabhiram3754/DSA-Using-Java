package Array;

public class Binary_Search{
    // Binary Search function
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // avoid overflow

            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid; // target found
            }

            // If target is greater, ignore left half
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }

        // Target not found
        return -1;
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;

        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found in array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}