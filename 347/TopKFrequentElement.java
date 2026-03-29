import java.util.*;

class TopKFrequentElement {
    public static int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i : nums){
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }




        
        // Bucket Sort [O(n)]
        List<List<Integer>> bucket = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            bucket.add(new ArrayList<>());
        }

        for(int key : hm.keySet()){
            int f = hm.get(key);

            bucket.get(f).add(key);
        }


        int[] result = new int[k];
        int index = 0;
        for(int i = n; index < k && i >= 0; i--){
            if(bucket.get(i) != null){
                for(int key : bucket.get(i)){
                    result[index++] = key;
                    if(index == k){
                        break;
                    }
                }
            }
        }

        return result;


        // Priority Queue Aproach [O(n log k)]
        // PriorityQueue<Integer> pq = new PriorityQueue<>(
        //     (a, b) -> hm.get(a) - hm.get(b)
        // );

        // for(int key : hm.keySet()){
        //     pq.add(key);
        //     if(pq.size() > k){
        //         pq.poll();
        //     }
        // }

        // int[] result = new int[k];
        // int i = 0;
        // while(!pq.isEmpty()){
        //     result[i++] = pq.poll();
        // }

        // return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;

        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
}