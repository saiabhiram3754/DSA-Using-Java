import java.util.*;

public class K_Shifts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int temp = arr[n-1];
        for (int i = 0; i <= k;i++) {   // K times repeating loop
            for(int j = n-2; j >= 0; j--) {  // shifting the elements to the right
                arr[j+1] = arr[j];
            }
            arr[0] = temp;
        }

        // Printing loop 
        
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }    
}