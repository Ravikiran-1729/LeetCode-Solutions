import java.util.*;

public class WordSearch{
    private static int[] r = {-1, 1, 0, 0};
    private static int[] c = {0, 0, -1, 1};

    private static boolean helper(int row, int col, char[][]board, int n, int m, int idx, String word, int size){
        if(idx == size){
            return true;
        }

        char ch = board[row][col];
        board[row][col] = '$';

        char curr = word.charAt(idx);

        for(int i =0; i<4; i++){
            int ur = row + r[i];
            int uc = col + c[i];

            if((ur >= 0 && ur < n) && (uc >= 0 && uc < m) && (board[ur][uc] == curr)){
                if(helper(ur,uc,board,n,m,idx+1,word,size)){
                    return true;
                }
            }
        }

        board[row][col] = ch;
        return false;
    }

    public static boolean exist(char[][] board, String word){
        int n = board.length;
        int m = board[0].length;
        int size = word.length();

        for(int i = 0; i<n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j] == word.charAt(0)){
                    if(helper(i, j, board, n, m, 1, word, size)){
                        return true;
                    }
                }
            }
        }

        return false;

    }
    public static void main(String[] args){
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};

        String word = "ABCCED";

        boolean isExists = exist(board, word);

        System.out.println(isExists);

    }
}       