import java.util.*;

public class paintersPartition {

    public static boolean isPossible(int[] boardLengths, int m, int maxBoardsLen){
        int painter = 1;
        int sum = 0;
        for(int len : boardLengths){
            if(sum + len <= maxBoardsLen){
                sum += len;
            }else{
                painter++;
                sum = len;

                if(painter > m){
                    return false;
                }
            }
        }
        return true;
    }

    public static int dividePainters(int[] boardLengths, int m){
        int low = 0;
        int high = 0;

        for(int l : boardLengths){
            low = Math.max(low, l);
            high += l; 
        }
        int ans = high;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(isPossible(boardLengths, m, mid)){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

     public static void main(String[] args) {
        int[] arr = {40,30,10,20};

        int m = 1;

        System.out.println(dividePainters(arr, m));
     }
}