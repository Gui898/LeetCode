public class Main {

    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};

        System.out.println(numberOfSteps(123));
    }

    public static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    public static int helper(int n, int counter){
        if(n == 0 && counter != 0){
            return counter-1;
        }else if(n == 0 & counter == 0){
            return 0;
        }

        if(n % 2 == 0){
            return helper(n / 2, counter+1);
        }

        return helper(n / 2, counter+2);
    }
}