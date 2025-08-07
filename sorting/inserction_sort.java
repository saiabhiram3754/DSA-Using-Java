package sorting;

public class inserction_sort {
    public static void insertion(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int prev = i - 1;
            while (prev >= 0 && array[prev] > current) {
                array[prev + 1] = array[prev];
                prev--;
            }
            array[prev + 1] = current;
        }
    }
    public static void main(String[] args) {
        int array[] = {5,4,1,3,2};
        insertion(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
