import java.util.Scanner;
public class SecondLargeNum {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        // Declare array
        int arr[] = new int[size];

        //input elements
        System.out.println("Enter the elements in array : ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        //find the second largest number in array
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i =0;i<size; i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];   
            }
            else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("The second largest number is: " + secondLargest);
        sc.close();
    }
}
