public class BinarySearch {

    /*
     * Iterative Binary Search
     * Works only on a SORTED array
     *
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    private static int search(int arr[], int target) {

        // Left and right pointers
        int left = 0;
        int right = arr.length - 1;

        // Continue searching while range is valid
        while (left <= right) {

            // Calculate mid index safely (avoids overflow)
            int mid = left + (right - left) / 2;

            // If target is found, return index
            if (arr[mid] == target) {
                return mid;
            }
            // If target is smaller, search left half
            else if (arr[mid] > target) {
                right = mid - 1;
            }
            // If target is larger, search right half
            else {
                left = mid + 1;
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {

        // Sorted input array
        int arr[] = {-1, 0, 3, 5, 9, 12};

        // Search for target value
        int idx = search(arr, 0);

        // Output index of target (or -1 if not found)
        System.out.println(idx); // Output: 1
    }
}
