package sorting;

public class selection_sort {
    public static void selection(int array[]){
        for (int i = 0; i < array.length - 1; i++) {
            int minpos = i;
            for (int j = i+1 ; j < array.length - 1; j++) {
                if ( array[minpos] > array[j]){
                    minpos = j;
                }
            }
            int temp = array[minpos];
            array[minpos] = array[i];
            array[i] = temp;
        }
    }
    
    public static void printarr(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        } 
        System.out.println();  
    }


   public static void main(String[] args) {
    int array[] = {2,3,5,4,1,5,6,7,8};
    selection(array);
    printarr(array);
   } 
}
