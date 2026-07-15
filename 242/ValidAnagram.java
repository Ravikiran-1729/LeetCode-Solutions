import java.util.*;

class ValidAnagram{
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        int[] freqs = new int[26];

        for(int i = 0; i < s.length(); i++){
            freqs[s.charAt(i) - 'a']++;
            freqs[t.charAt(i) - 'a']--;
        }

        for(int freq : freqs){
            if(freq != 0){
                return false;
            }
        }

        return true;
    }
    public static void main(String args[]){
        String s = "anagram";
        String t = "nagaram";

        boolean isAna = isAnagram(s, t);

        System.out.println(isAna); 
    }
}