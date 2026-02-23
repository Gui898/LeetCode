import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};

        System.out.println(kidsWithCandies(arr, 3));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int a : candies){
            if(a > max){
                max = a;
            }
        }

        List<Boolean> list = new LinkedList<>();

        for(int a : candies){
            if(a+extraCandies >= max){
                list.add(true);
            }else list.add(false);
        }

        return list;
    }


}