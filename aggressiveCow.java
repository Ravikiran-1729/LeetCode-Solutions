import java.util.*;



public class aggressiveCow {

    public static boolean isValid(int[] stalls, int cows, int minDistance){
        int totalStalls = stalls.length;
        int cowPlaced = 1;
        int lastPlacedIndex = 0;

        for(int currentIndex = 1; currentIndex < totalStalls && cowPlaced < cows; currentIndex++){
            if(stalls[currentIndex] - stalls[lastPlacedIndex] >= minDistance){
                cowPlaced++;
                lastPlacedIndex = currentIndex;
            }
        }

        return cowPlaced == cows;
    }

    public static int placeAggressiveCow(int[] stalls, int cows){
        Arrays.sort(stalls);

        int totalStalls = stalls.length;

        int low = 1;
        int high = stalls[totalStalls - 1] - stalls[0];
        int largestMinDistance = 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if(isValid(stalls, cows, mid)){
                largestMinDistance = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return largestMinDistance;
    }
    public static void main(String[] args) {
        int[] stalls = {6, 1, 9, 3, 8};
        int k = 3;

        int largestMinDistance = placeAggressiveCow(stalls, k);

        System.out.println("Largest Minimum distance btw aggressive cow: " + largestMinDistance);

    }
}