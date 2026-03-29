import java.util.*;

class KthLargestElement{
    public static int findKthLargest(int[] nums, int k) {

        // PriorityQueue Approach [O(nlogk)]
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i = 0; i<nums.length; i++){
            minHeap.add(nums[i]);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        return minHeap.peek();


        // Direct Sort [O(nlogn)]
        // int n = nums.length;
        // Arrays.sort(nums);
        // return nums[n - k];
    }

    public static void main(String[] args) {
        int nums[] = {3,2,1,5,6,4};
        int k = 2;

        System.out.println(findKthLargest(nums, k));
    }
}
