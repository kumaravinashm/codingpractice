package arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class ThreeGreatestNumber {
    public static void main(String[] args) {
        int arr[] = {1,1,2};
        System.out.println(largest3(arr));
    }

    static int largest3(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int a:arr){
            set.add(a);
        }
        int i,first,second,third;
        first=second=third=Integer.MIN_VALUE;
        for(int a:set){
            if(a>first){
                third = second;
                second= first;
                first = a;
            } else if (a>second) {
                third = second;
                second= a;
            }
            else if (a>third) {
                third = a;
            }
        }
        if(set.size()==2){
            return first;
        }else if(set.size()==1){
            return first;
        }else
            return third;

    }
}
