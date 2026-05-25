public class Main {

    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;

        int area = 0;
        while (left < right){
            int minor = Math.min(height[left], height[right]);

            int current = (right - left) * minor;

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }

            if (current > area){
                area = current;
            }
        }

        return area;
    }

}