
import java.util.HashMap;

public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int prefixSum = 0, ans = 0;

        for(int i = 0; i<n; i++){
            prefixSum += nums[i];

            if(map.containsKey(prefixSum - k)){
                ans += map.get(prefixSum - k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {9,4,20,3,10,5};

        int k = 33;

        int ans = subarraySum(nums, k);
        System.out.print(ans);

    }
}
