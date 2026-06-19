import java.util.*;

class RemoveAllOccurrences{

    public static String removeOccurrences(String s, String part){
        while(s.indexOf(part) != -1){
            int idx = s.indexOf(part);
            s = s.substring(0, idx) + s.substring(idx+part.length());
        }
        return s;
    }
    public static void main(String ars[]){
        String str = removeOccurrences("daabcbaabcbc", "abc");

        System.out.println(str);
    }
}