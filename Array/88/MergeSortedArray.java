public class MergeSortedArray {

    // Merges two sorted arrays into a single sorted array
    private static int[] merge(int[] arr1, int[] arr2){

        // Total size of the merged array
        int size = arr1.length + arr2.length;

        // Array to store merged result
        int[] newArray = new int[size];

        // Pointers for arr1, arr2, and newArray
        int i = 0;   // pointer for arr1
        int j = 0;   // pointer for arr2
        int k = -1;  // pointer for newArray (starts at -1 for pre-increment)

        // Traverse both arrays until one is exhausted
        while (i != arr1.length && j != arr2.length) {

            // Compare elements and insert the smaller one
            if(arr1[i] < arr2[j]){
                newArray[++k] = arr1[i++];
            } else {
                newArray[++k] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1 (if any)
        while (i != arr1.length) {
            newArray[++k] = arr1[i++];
        }

        // Copy remaining elements of arr2 (if any)
        while (j != arr2.length) {
            newArray[++k] = arr2[j++];
        }

        // Return merged sorted array
        return newArray;
    }

    public static void main(String[] args) {

        // Two already sorted arrays
        int[] arr1 = {1, 1, 5};
        int[] arr2 = {2, 3, 4, 6};

        // Merge the arrays
        int[] result = merge(arr1, arr2);

        // Print the merged array
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
