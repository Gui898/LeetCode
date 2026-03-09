import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};

        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));

    }

    public static int lengthOfLastWord(String s) {
        int size = s.length();
        boolean hasWord = false;
        int val = 0;

        if(size == 0) return 0;

        for (int i = size-1; i >= 0; i--) {

            if(s.charAt(i) != ' '){
                val++;
                hasWord = true;
            }else{
                hasWord = false;
            }

            if(val != 0 && !hasWord){
                break;
            }
        }

        return val;
    }


}