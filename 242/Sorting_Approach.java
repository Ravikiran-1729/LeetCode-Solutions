import java.util.*;

class Sorting_Approach{
    public static boolean isAnagram(String s, String t){
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        
        return Arrays.equals(a, b);
    }
    public static void main(String args[]){
        String s = "anagram";
        String t = "nagaram";

        boolean isAna = isAnagram(s, t);

        System.out.println(isAna); 
    }
}