public class diagonial_sum {
    public static int dia_sum(int matrix[][]){
        int sum =0;

        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){  // O(n^2)
        //         if (i==j){
        //             sum+=matrix[i][j];
        //         }
        //         else if(i+j == matrix.length -1 ){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        for (int i = 0; i < matrix.length; i++) { // O(n)
            
            sum = sum + matrix[i][i];
            if ( i != matrix.length - 1 -i){
                sum += matrix[i][matrix.length - 1 -i];
            }
        }
        return sum;
    }

    public static void main(String args[]){
        int matrix[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(dia_sum(matrix));
    }
}
