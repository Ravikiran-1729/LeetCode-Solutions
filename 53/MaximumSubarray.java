import java.util.*;

class MaximumSubarray{

    public static int maxSubArray(int[] nums){
        int sum = nums[0];
        int max = nums[0];

        for(int i = 1; i<nums.length; i++){
            sum = Integer.max(nums[i], sum + nums[i]);
            max = Integer.max(sum, max);
        }

        return max;
    }
    public static void main(String args[]){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int max = maxSubArray(nums);

        System.out.println(max);
    }
}