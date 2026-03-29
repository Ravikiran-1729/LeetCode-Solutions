public class RotateArray {

    /*
     * LEFT ROTATION using Reversal Algorithm
     * Rotates the array to the left by 'key' positions
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    private static void leftRotate(int arr[], int key) {

        int n = arr.length;

        // Normalize rotations (handles key > n)
        int k = key % n;

        // Step 1: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 2: Reverse remaining elements
        reverse(arr, k, n - 1);

        // Step 3: Reverse the entire array
        reverse(arr, 0, n - 1);
    }

    /*
     * RIGHT ROTATION using Reversal Algorithm
     * Rotates the array to the right by 'key' positions
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    private static void rightRotate(int arr[], int key) {

        int n = arr.length;

        // Normalize rotations
        int k = key % n;

        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse remaining elements
        reverse(arr, k, n - 1);
    }

    /*
     * Utility method to reverse elements
     * between index 'start' and 'end'
     */
    private static void reverse(int arr[], int start, int end) {

        int left = start;
        int right = end;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    /*
     * Utility method to print array elements
     */
    private static void print(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // LEFT ROTATION EXAMPLE
        int arr[] = {2, 3, 9, 5, 6, 1};
        int key = 2;

        leftRotate(arr, key);
        print(arr);
        // Output: {9, 5, 6, 1, 2, 3}

        /*
         * Step 1: {3, 2, 9, 5, 6, 1}
         * Step 2: {3, 2, 1, 6, 5, 9}
         * Step 3: {9, 5, 6, 1, 2, 3}
         */

        // RIGHT ROTATION EXAMPLE
        int arr1[] = {2, 3, 9, 5, 6, 1};
        int key1 = 2;

        rightRotate(arr1, key1);
        print(arr1);
        // Output: {6, 1, 2, 3, 9, 5}

        /*
         * Step 1: {1, 6, 5, 9, 3, 2}
         * Step 2: {6, 1, 5, 9, 3, 2}
         * Step 3: {6, 1, 2, 3, 9, 5}
         */
    }
}
