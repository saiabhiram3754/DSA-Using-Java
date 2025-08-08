package DivideAndConquer;

public class Roated_Array {
    public static int search(int arr[],int target, int si ,int ei){
        //base case
        if(si > ei){
            return -1;
        }

        //mid value
        int mid = si + (ei-si) / 2;

        //case 1
        if(arr[mid] == target){
            return mid;
        }

        //case 2 mid on line l1

        if(arr[si] <= arr[mid]){
            //case 1 for left part
            if(arr[si] <= target && target <= arr[mid]){
                return search(arr, target, si, mid-1);
            }
            //case 2 for right part 
            else{
                return search(arr, target, mid +1, ei);
            }
        }
        
        // mid on line 2

        else {
            // case 3 right part 
            if (arr[mid] <= target && target <= arr[ei]){
                return search(arr, target, mid +1, ei);
            }
            else {
                return search(arr, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2, 3};
        int target = 0;
        int targetIndex = search(arr, target ,0 ,arr.length - 1);
        System.out.println(targetIndex);
    }
}

