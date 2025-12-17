public class TrapWater_2Pointer {
    public static int trapWater2P(int arr[], int size) {

        int left = 0, right = size - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        // Traverse until pointers meet
        while (left < right) {

            // Move the pointer with smaller height
            if (arr[left] < arr[right]) {

                // Update left maximum
                if (arr[left] > leftMax) {
                    leftMax = arr[left];
                } else {
                    // Water trapped at left index
                    water += leftMax - arr[left];
                }
                left++;

            } else {

                // Update right maximum
                if (arr[right] > rightMax) {
                    rightMax = arr[right];
                } else {
                    // Water trapped at right index
                    water += rightMax - arr[right];
                }
                right--;
            }
        }
        return water;
    }

    public static void main(String[] args) {

        // Sample test case
        int arr[] = {1, 5, 3, 2, 0, 1, 2};

        // Using two-pointer optimized approach
        int a = trapWater2P(arr, arr.length);

        System.out.println(a);  // Output: 4
    }
}


