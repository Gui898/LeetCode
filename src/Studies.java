import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Locale;

public class Studies {

    public static void main(String[] args) {
        int[] arr = {7,6,2,78,9,2,4,1,3,7,5,9,665,12};

        System.out.println(addBinary("1", "11"));
    }

    public static String addBinary(String a, String b) {
        String minor = a;
        String major = b;

        if(a.length() > b.length()){
            minor = b;
            major = a;
        }

        StringBuilder result = new StringBuilder();

        boolean carry = false;

        for (int i = minor.length() - 1; i >= 0; i--) {

            int diff = major.length() -  minor.length();

            if(minor.charAt(i) == '0' && major.charAt(i+diff) == '0'){
                if(carry){
                    result.insert(0,'1');
                    carry = false;
                }else{
                    result.insert(0,'0');
                }
            } else if((minor.charAt(i) == '1' && major.charAt(i+diff) == '0') || (minor.charAt(i) == '0' && major.charAt(i+diff) == '1')) {
                if(carry){
                    result.insert(0,'0');
                }else{
                    result.insert(0,'1');
                }
            } else if (minor.charAt(i) == '1' && major.charAt(i+diff) == '1') {
                if(carry){
                    result.insert(0,'1');
                }else{
                    result.insert(0,'0');
                    carry = true;
                }
            }
        }

        if(major.length() > result.length()){
            for (int i = major.length() -  result.length() - 1; i >= 0; i--) {

                if(major.charAt(i) == '0'){
                    if(carry){
                        result.insert(0,'1');
                        carry = false;
                    }else{
                        result.insert(0,'0');
                    }
                } else{
                    if(carry){
                        result.insert(0,'0');
                    }else{
                        result.insert(0,'1');
                    }
                }
            }
        }

        if(carry){
            result.insert(0, "1");
        }

        return result.toString();
    }

}
