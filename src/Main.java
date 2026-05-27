public class Main {

    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};

        System.out.println(strStr("mississippi", "issip"));
    }

    public static int strStr(String haystack, String needle) {
        int need = 0;

        int n = haystack.length();

        for (int i = 0; i < n; i++) {
            if(haystack.charAt(i) == needle.charAt(need)){
                need++;
                if (need == needle.length()){
                    return i - need + 1;
                }
            }else{
                if(need != 0 && i > 0){
                    i -= need;
                }
                need = 0;
            }
        }

        return -1;
    }

}