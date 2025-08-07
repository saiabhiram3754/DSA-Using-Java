import java.util.*;

public class sample {
    public static double avg(int a, int b, int c) {
        int sum = a + b + c;
        double avg = sum / 3.0; 
        return avg;
    }

    public static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length-1-i; j++) {
              System.out.print(arr[j]+" ");  
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
		sc.close();
        System.out.println("Average is : " + avg(a, b, c));

        int arr[] ={7,8,6,3,4,5,2,11};
        printarr(arr);
    }
}
