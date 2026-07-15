import java.util.*;

class GroupAnagrams{
    private static String getHash(String str){
        StringBuilder sb = new StringBuilder();
        
        int[] freqs = new int[26];

        for(int i = 0; i<str.length(); i++){
            freqs[str.charAt(i) - 'a']++;
        }

        for(int freq : freqs){
            if(freq > 0){
                sb.append(String.valueOf(freq));
            }
            sb.append("$");
        }

        return sb.toString();
    }

    public static List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            String hash = getHash(str);

            map.putIfAbsent(hash, new ArrayList<>());
            map.get(hash).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args){
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        String[] strs1 = {""};
        List<List<String>> groups = groupAnagrams(strs1);

        System.out.println(groups);
    }
}