
public class MajorityElement {
    private static int majorityElement(int[] nums) {

        // Step 1: Find a potential majority candidate
        int candidate = 0;
        int count = 0;

        // Boyer–Moore Voting Phase
        for (int num : nums) {

            // If count becomes 0, choose current element as new candidate
            if (count == 0) {
                candidate = num;
            }

            // Increase count if same as candidate, otherwise decrease
            count += (num == candidate) ? 1 : -1;
        }

        // Step 2: Verify whether the candidate is actually a majority element
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        // A majority element must appear more than n/2 times
        return (count > nums.length / 2) ? candidate : -1;
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        System.out.println(majorityElement(arr));
    }
}