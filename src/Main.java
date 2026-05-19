public class Main {

    public static void main(String[] args) {
        int[] arr = {1,0,0,0,0,1};

        System.out.println(mergeAlternately("abcd", "pq"));

    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();

        int val = Math.max(word1.length(), word2.length());

        for(int i = 0; i < val; i++){
            if(i < word1.length()){
                ans.append(word1.charAt(i));
            }
            if(i < word2.length()){
                ans.append(word2.charAt(i));
            }
        }

        return ans.toString();
    }

}