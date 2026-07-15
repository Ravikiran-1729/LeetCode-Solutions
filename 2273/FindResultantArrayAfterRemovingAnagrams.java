import java.util.*;

class FindResultantArrayAfterRemovingAnagrams{
    private static boolean isAnagram(String s, String t){
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        
        return Arrays.equals(a, b);
    }

    public static List<String> removeAnagrams(String[] words){
        List<String> list = new ArrayList<>();

        list.add(words[0]);

        for(int i = 1; i<words.length; i++){
            if(isAnagram(words[i], words[i-1])){
                continue;
            }else{
                list.add(words[i]);
            }
        }
        return list;
    }

    public static void main(String[] args){
        String[] words = {"abba","baba","bbaa","cd","cd"};

        List<String> uniqueWords = removeAnagrams(words);

        System.out.println(uniqueWords);

    }
}