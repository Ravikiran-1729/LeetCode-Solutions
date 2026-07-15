import java.util.*;

public class setMatrixZeroes{

    public static int[][] setZeros(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        boolean col = false;

        for(int i = 0; i<n; i++){
            if(matrix[i][0] == 0){
                col = true;
            }

            for(int j = 1; j<m; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = n - 1; i >= 0; i--){
            for(int j = m - 1; j >= 0; j--){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }

            if(col){
                matrix[i][0] = 0;
            }
        }

        return matrix;
    }


    public static void main(String[] args){
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};

        int[][] matrix_zeros = setZeros(matrix);

        for(int i = 0;  i<matrix_zeros.length; i++){
            for(int j = 0; j<matrix_zeros[0].length; j++){
                System.out.print(matrix_zeros[i][j]);
            }
            System.out.println();
        }
    }
}