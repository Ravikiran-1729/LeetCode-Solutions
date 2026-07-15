import java.util.*;

class Search2DMatrix_II{

    private static boolean search(int[][] matrix, int target){
        int n = matrix.length;
        int m = matrix[0].length;

        int i = 0;
        int j = m - 1;

        while(i >= 0 && j >= 0 && i < n && j < m){
            if(matrix[i][j] == target){
                return true;
            }

            else if(matrix[i][j] > target){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }

    public static void main(String args[]){
        int[][] matrix = {
            {1,4,7,11,15},
            {2,5,8,12,19},
            {3,6,9,16,22},
            {10,13,14,17,24},
            {18,21,23,26,30}
        };

        boolean isExist = search(matrix, 11);

        System.out.println(isExist);
    }
}