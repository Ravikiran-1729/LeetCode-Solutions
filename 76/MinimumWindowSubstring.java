import java.util.*;

class MinimumWindowSubstring{

    public static String minWindow(String s, String t){
        int n = s.length();

        int[] freqs = new int[256];

        for(char ch : t.toCharArray()){
            freqs[ch]++;
        }

        int i = 0;
        int j = 0;
        int count = 0;
        int required = t.length();
        int minWind = Integer.MAX_VALUE;
        int start = 0;

        while(j < n){
            if(freqs[s.charAt(j)] > 0){
                count++;
            }
            freqs[s.charAt(j)]--;

            while(count == required){
                if(minWind > j - i + 1){
                    minWind = j - i + 1;
                    start = i;
                }
                freqs[s.charAt(i)]++;
                if(freqs[s.charAt(i)] > 0){
                    count--;
                }
                i++;
            }
            j++;
        }

        return (minWind != Integer.MAX_VALUE) ? s.substring(start, start + minWind) : "";   
    }

    public static void main(String[] args){
        String s = "ADOBECODEBANC";

        String t = "ABC";

        String minWind = minWindow(s, t);

        System.out.println(minWind);
    }
}