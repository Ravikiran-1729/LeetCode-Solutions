import java.util.*;

class KClosestPointsToOrigin {

    

    public static int[][] kClosest(int[][] points, int k) {
        // Sorting = O(n log n)

        int n = points.length;
        Arrays.sort(points, new Comparator<int[]>(){
            public int compare(int[] p1, int[] p2){
                int d1 = (p1[0] * p1[0]) + (p1[1] * p1[1]);
                int d2 = (p2[0] * p2[0]) + (p2[1] * p2[1]);

                return Integer.compare(d1, d2);
            }
        });

        return Arrays.copyOfRange(points, 0, k);


        // Heap = O(n log k) (better for large input)
        
        // PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
        //     (a, b) -> ((b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1]))
        // );

        // for(int[] point : points){
        //     maxHeap.add(point);
        //     if(maxHeap.size() > k){
        //         maxHeap.poll();
        //     }

        // }

        // int[][] result = new int[k][2];
        // int i = 0;
        // while(!maxHeap.isEmpty()){
        //     result[i++] = maxHeap.poll();
        // }

        // return result;
    }


    public static void main(String[] args) {
        int[][] points = {{1,3},{-2,2}};
        int k = 1;

        int[][]result = kClosest(points, k);

        System.out.println(Arrays.deepToString(result));
        
    }
}