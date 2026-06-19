import java.util.*;

class PrefixShrink_approach{

    public static String longestCommonPrefix(String strs[]){
        String prefix = strs[0];

        for(int i = 1; i<strs.length; i++){
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
    public static void main(String[] args){
        String strs[] = {"flower","flow","flight"};
        
        String prefix = longestCommonPrefix(strs);

        System.out.println(prefix);

    }
}