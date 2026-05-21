import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5};
        System.out.println(findMaxAverage(arr, 1));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int i = 0;
        double sum = 0;

        for (int j = 0; j < k; j++) {
            sum += nums[j];
        }

        double maxSum = sum;

        while(i+k < nums.length){
             sum -= nums[i];
             if(i+k < nums.length){
                 sum += nums[i+k];
                 if(sum > maxSum){
                     maxSum = sum;
                 }
             }
             i++;
        }
        return maxSum/k;
    }

}