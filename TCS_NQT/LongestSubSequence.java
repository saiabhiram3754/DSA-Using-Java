public class LongestSubSequence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = longestSubSequence(arr);
        System.out.println("Length of the longest subsequence: " + result);
    }

    public static int longestSubSequence(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int p = arr[0];
        System.out.println(p +" ");
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > p) {
                System.out.println(p +" ");
                p = arr[i];
            }
        }
        return -1; // Placeholder return, replace with actual logic
    }
}
