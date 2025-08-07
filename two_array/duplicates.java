public class duplicates {
    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 2, 3, 4, 8, 7};
        int n = arr.length;

        System.out.println("Duplicate elements:");
        boolean hasDuplicates = false;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break; 
                }
            }

            if (!isDuplicate) {
                for (int k = i + 1; k < n; k++) {
                    if (arr[i] == arr[k]) {
                        System.out.println(arr[i]);
                        hasDuplicates = true;
                        break;
                    }
                }
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicates found.");
        }
    }
}
