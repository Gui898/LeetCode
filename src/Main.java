import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2,1,-1};

        System.out.println(pivotIndex(arr));
    }

    //lado direito menos o lado esquerdo dos prefixos

    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            prefix[i] = sum;
        }

        for (int i = 0; i < n; i++) {

            int val = prefix[n-1] - prefix[i];

            if(i == 0){
                if(0 == val){
                    return i;
                }
            }else {
                if(prefix[i-1] == val){
                    return i;
                }
            }

        }

        return -1;
    }

}