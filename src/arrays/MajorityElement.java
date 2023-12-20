package arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(getMajority(nums));
    }
    static int getMajority(int[] nums){
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums ){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        int maxOccur=0;
        int maxElement=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ;
            if(entry.getValue()>maxOccur){
                 maxOccur=entry.getValue();
                 maxElement=entry.getKey();
            }
        }
        return maxElement;
    }

}
