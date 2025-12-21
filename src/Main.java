public class Main {

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        System.out.println(reverseVowels("IceCreAm"));
    }

    public static String reverseVowels(String s) {

        char[] chars = s.toCharArray();

        int i = 0 ;
        int j = s.length()-1;

        while (i< j){
            while (i < j && !isVowel(chars[i])) {
                i++;
            }

            while (i < j && !isVowel(chars[j])) {
                j--;
            }

            if (i < j) {
                swap(chars, i, j);
                i++;
                j--;
            }

        }

        return new String(chars);
    }

    private static void swap(char[] word, int start, int end){
        char temp = word[start];
        word[start] = word[end];
        word[end] = temp;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}