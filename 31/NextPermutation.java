
import java.util.Arrays;

public class NextPermutation {
    public static int[] nextPermutation(int nums[]){
        int n =  nums.length-1;
        int i = n - 1;

        while (i>=0) {
            if (nums[i] < nums[i+1]) {
                break; 
            }
            i--;
        }

        if(i<0){
            reverseArray(nums, 0, n);
            return nums;
        }

        int j = n;
        while (j > i) {
            if (nums[j] > nums[i]) {
                break;
            }
            j--;
        }

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

        reverseArray(nums, i+1, n);

        return nums;
    }

    public static void reverseArray(int nums[], int si, int ei){
        if(si>=ei) return;

        int left = si;
        int right = ei;
        while (left<right) {
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(nums));

        int permutation = 1;
        for(int i = 1; i<= nums.length; i++){
            permutation *= i;
        }

        int i = 1;
        while (i<permutation) {
            int nextNums[] = nextPermutation(nums);
            System.out.println(Arrays.toString(nextNums));
            nums = nextNums;
            i++;
        }
    }
}
