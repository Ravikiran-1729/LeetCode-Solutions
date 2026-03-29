import java.util.HashSet;

public class LongestSubstringWithoutRepeating {
    public static int solution(String s){
        int maxLen = 0;
        int left = 0, right = 0;
        HashSet<Character> set = new HashSet<>();

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLen = Math.max(maxLen, right-left+1);
                right++;
            }else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "bbbbacdabab";
        int maxLen = solution(s);

        System.out.println(maxLen);

    }
}
