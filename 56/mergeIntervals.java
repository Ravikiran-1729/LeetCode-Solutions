import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class mergeIntervals {

    public static int[][] mergeOverlaps(int[][] nums){
        Arrays.sort(nums, (a, b)-> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        int[] prev = nums[0];

        for(int i = 1; i<nums.length; i++){
            int[] curr = nums[i];

            if (curr[0] <= prev[1]){
                prev[1] = Integer.max(prev[1], curr[1]);
            }else{
                result.add(prev);
                prev = curr;
            }
        }

        result.add(prev);

        return result.toArray(new int[result.size()][2]);
    }

    public static void main(String[] args) {
        // int[][] nums = {{1,3},{2,6},{8,10},{15,18}};
        int[][] nums = {{4,7}, {1, 4}};
        Arrays.sort(nums, (a, b) -> a[0] - b[0]);
        System.out.println(Arrays.deepToString(nums));

        int[][] intervals = mergeOverlaps(nums);

            System.out.println(Arrays.deepToString(intervals));
        
    }
}