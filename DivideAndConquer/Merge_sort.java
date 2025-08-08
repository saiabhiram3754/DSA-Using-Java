package DivideAndConquer;

public class Merge_sort {
    public static void Mergesort(int[] arr, int si, int ei){
        if(si >= ei){
            return;
        }
        //mid value
        int mid = si + (ei - si) / 2;  // (si+ei) /2 
        Mergesort(arr, si, mid);
        Mergesort(arr, mid+1, ei);
        merge(arr,si,mid,ei);

    }

    public static void merge(int[] arr,int si, int mid, int ei){
        // left (0,3) = 4 right(4,6) = 3
        int temp[] = new int[ei-si+1];       // lenfth of the temp
        int i = si;
        int j = mid+1;
        int k = 0;

    
        while(i <= mid && j <= ei){
            
            // copying elements from the left array 

            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
               
            }
            // copying the elements from the right array
            
            else{ 
                temp[k] = arr[j];
                j++;
                
            }
            k++;
        }

        // remaining elements copying from left and right array

        while(i <= mid){
            temp[k++] = arr[i++];
        }

        while(j <= ei){
            temp[k++] = arr[j++];
        }
        
        // copying

        for (k = 0,i = si; k < temp.length; k++ ,i++) {
            arr[i] = temp[k];
        }

    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        Mergesort(arr, 0, arr.length -1);
        printArr(arr);
    }
}
