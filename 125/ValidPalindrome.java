import java.util.*;

class ValidPalindrome{

    public static boolean isAlphaNum(char ch){
        if((ch >= '0' && ch<='9') || (Character.toLowerCase(ch)>='a' && Character.toLowerCase(ch)<='z')){
            return true;
        }
        return false;

    }
    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            if(!isAlphaNum(s.charAt(left))){
                left++;
            }

            if(!isAlphaNum(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String args[]){
        System.out.println("HEllo");
        boolean isValid = isPalindrome("abaa");

        System.out.println(isValid);
    }
}