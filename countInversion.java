public class countInversion {

    private static int mergeSort(int[] nums, int low, int high){
        int count = 0;
        if(low < high){
            int mid = low + ((high - low ) / 2);
            count += mergeSort(nums, low, mid);
            count += mergeSort(nums, mid+1, high);
            count += merge(nums, low, mid, high);
        }
        return count;
    }

    private static int merge(int[] nums, int low, int mid, int high){
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i = 0; i<n1; i++){
            left[i] = nums[i+low];
        }
        for(int i = 0; i<n2; i++){
            right[i] = nums[i+mid+1];
        }

        int i = 0, j = 0, k = low, count = 0;

        while (i < n1 && j < n2) {
            if(left[i] <= right[j]){
                nums[k++] = left[i++];
            }else{
                nums[k++] = right[j++];
                count += n1 - i;
            }
        }

        while (i<n1) {
            nums[k++] = left[i++];
        }
        while (j<n2) {
            nums[k++] = right[j++];
        }

        return count;
    }


    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};

        int count = mergeSort(nums, 0, nums.length - 1);

        System.out.println(count);

    }
}
