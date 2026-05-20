import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1,0,0,0,0,1};

        System.out.println(reverseWords("a good   example"));

    }

    public static String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i].isEmpty()){
                continue;
            }
            ans.append(arr[i]);
            ans.append(" ");
        }
        return ans.toString().strip();
    }

}