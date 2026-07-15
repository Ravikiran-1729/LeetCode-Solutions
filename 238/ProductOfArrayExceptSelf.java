import java.util.Arrays;

public class ProductOfArrayExceptSelf{

    private static int[] prouctExceptSelf(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, 1);

        for(int i = 1; i<n; i++){
            ans[i] = ans[i-1] * nums[i-1];
        }

        int suffix = nums[n-1];

        for(int i = n-2; i>=0; i--){
            ans[i] = ans[i] * suffix;
            suffix *= nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        int[] ans = prouctExceptSelf(nums);

        System.out.println(Arrays.toString(ans));
        
    }
}