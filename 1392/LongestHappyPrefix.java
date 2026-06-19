import java.util.*;

class LongestHappyPrefix{

    // A string is called a happy prefix if is a non-empty prefix which is also a suffix (excluding itself).
    // Proper Prefix 
    // KMP-table (Longest common prefix and suffix)
    public static String longestPrefix(String s){
        int n = s.length();

        int lps[] = new int[n]; 

        int len = 0;
        int i = 1;

        while(i < n){
            if(s.charAt(i) == s.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len != 0){
                    len = lps[len - 1];
                }else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return s.substring(0, lps[n-1]);
    }

    public static void main(String args[]){
        String str = longestPrefix("ababab");

        System.out.println(str);;
    }
}