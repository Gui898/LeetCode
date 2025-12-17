import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr, 9)));;
    }

    public static int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = i+1;
        while(i != nums.length){

            if(j < nums.length && nums[i] + nums[j] == target) return new int[]{i, j};
            else j++;

            if(j >= nums.length){
                i++;
                j=i+1;
            }
        }
        return new int[0];
    }
}