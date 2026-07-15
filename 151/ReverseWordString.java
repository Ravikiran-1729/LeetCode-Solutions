import java.util.*;

class ReverseWordString{

    public static String reverseWords(String s){
        StringBuilder sb = new StringBuilder();

        String[] arr = s.trim().split("\\s+");

        for(int i = arr.length-1; i>=0; i--){
            sb.append(arr[i]).append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args){
        String s = "  a good   example  ";

        String reverseString = reverseWords(s);

        System.out.println(reverseString);
    }
}