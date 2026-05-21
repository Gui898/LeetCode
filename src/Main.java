import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5};
        System.out.println(maxVowels("leetcode", 3));
    }

    public static int maxVowels(String s, int k) {
        int sum = 0;

        for (int i = 0; i < k; i++) {
            if(verifyVowel(s.charAt(i))){
                sum += 1;
            }
        }

        int maxSum = sum;
        int i = 0;

        while(true){
            if(i+k >= s.length()){
                break;
            }

            if(verifyVowel(s.charAt(i))){
                sum -= 1;
            }
            if(verifyVowel(s.charAt(i+k))){
                sum += 1;
            }

            if(sum > maxSum){
                maxSum = sum;
            }

            i++;
        }

        return maxSum;
    }

    public static boolean verifyVowel(char str){
        return str == 'a' || str == 'e' || str == 'i' || str == 'o' || str == 'u';
    }

}