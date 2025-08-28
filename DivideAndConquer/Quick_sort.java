package DivideAndConquer;

public class Quick_sort {

    public static void Quicksort(int arr[],int si,int ei){
    
        if(si >= ei){
            return;
        }
        
        //last element
        int pidx = partition(arr,si,ei); 

        Quicksort(arr,si,pidx -1);
        Quicksort(arr,pidx +1,ei);

    }
    
    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si -1 ;

        for (int j = si; j < arr.length; j++) {
            if(arr[j] < pivot){
                i++;
                //swap of elements which are less than the pivot 
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++; 
        //swapping of pivot 
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        Quicksort(arr, 0, arr.length -1);
        printArr(arr);
    } 
}
