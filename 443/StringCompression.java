import java.util.*;

class StringCompression{

    private static void print(char[] chars, int size){
        System.out.print("Compressed Array: [");
        for(int i = 0; i<size; i++){
            System.out.print(chars[i]+", ");
        }
        System.out.print("]");
        System.out.println();
    }


    public static int compress(char[] chars){
        int write = 0;
        int read = 0;
        
        while(read < chars.length){
            char current = chars[read];
            int count = 0;

            while(read < chars.length && chars[read] == current){
                read++;
                count++;
            }

            chars[write++] = current;

            if(count > 1){
                for(char digit : String.valueOf(count).toCharArray()){
                    chars[write++] = digit;
                }
            }
        }

        print(chars, write);

        return write;
    }
    public static void main(String[] args){
        char[] chars = {'a', 'a', 'a', 'a', 'b', 'b', 'c', 'c', 'c', 'd'};

        int compressedLen = compress(chars);

        System.out.println("Size of compressed Array: "+ compressedLen);
    }
}