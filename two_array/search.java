public class search {

    public static boolean find(int matrix[][],int key){
        int row = 0;
        int col = matrix[0].length -1;

        while(row < matrix.length && col >= 0){
            if (matrix[row][col] == key ){
                System.out.println("key is found at " + row +col);
                return true;
            }
            else if( key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }

        System.out.println();
        return false;
    }
    public static void main(String args[]){
        int matrix[][] ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int key = 8;
        System.out.println(find(matrix,key));
    }
}