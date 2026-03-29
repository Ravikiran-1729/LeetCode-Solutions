public class TrapWater_Prefix {

    /*
     * APPROACH 1: Prefix Max Arrays
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static int trappedWater(int arr[], int size) {

        // Stores maximum height to the left of each index
        int leftMax[] = new int[size];

        // Stores maximum height to the right of each index
        int rightMax[] = new int[size];

        // Initialize boundary values
        leftMax[0] = arr[0];
        rightMax[size - 1] = arr[size - 1];

        // Build leftMax array
        for (int i = 1; i < size; i++) {
            leftMax[i] = Integer.max(arr[i], leftMax[i - 1]);
        }

        // Build rightMax array
        for (int i = size - 2; i >= 0; i--) {
            rightMax[i] = Integer.max(arr[i], rightMax[i + 1]);
        }

        // Calculate trapped water
        int water = 0;
        for (int i = 0; i < size; i++) {

            // Minimum of left and right boundary
            int boundary = Integer.min(leftMax[i], rightMax[i]);

            // Water stored at index i
            water += boundary - arr[i];
        }

        return water;
    }



    public static void main(String[] args) {

        // Sample test case
        int arr[] = {1, 5, 3, 2, 0, 1, 2};

        // Using prefix max arrays
        int a = trappedWater(arr, arr.length);

        System.out.println(a);   // Output: 4
    }
}
