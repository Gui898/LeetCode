import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[][] arr = {{0,0,0},
                       {0,0,0}};

        System.out.println(letterCombinations("23"));
    }

    public static List<String> letterCombinations(String digits) {
        return helper("", digits);
    }

    static List<String> helper(String p, String up){

        List<String> val = new ArrayList<>();

        if(up.isEmpty()){
            val.add(p);
            return val;
        }

        int digit = (up.charAt(0) - '0') - 1;
        int start = (digit-1) * 3;
        int end = digit * 3;

        if(digit == 6){
            end += 1;
        } else if (digit == 7) {
            start += 1;
            end += 1;
        } else if (digit == 8) {
            start += 1;
            end += 2;
        }

        for (int i = start; i < end; i++) {
            char ch = (char) ('a' + i);
            val.addAll(helper(p + ch, up.substring(1)));
        }

        return val;
    }

}