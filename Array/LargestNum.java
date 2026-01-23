import java.util.*;

public class LargestNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Input elements in array
        System.out.println("Enter the Number of elements in array : ");
        int size = sc.nextInt();

        // Declare array
        int arr[] = new int[size];

        //Input Elements
        System.out.println("Enter the elements in array : ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        //find the laregst number in array
        int largest = arr[0]; // Assume first element is largest
        for(int i =1;i<size; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest number in array is: " + largest);
        sc.close();
    }
}