package arrays;

public class SingleNumberFind {

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2,4,7,8,8};
        System.out.println(singleNumber(nums));
    }


    public static int singleNumber(int[] nums) {
        int res = 0;
        for(int i = 0; i < nums.length; i++)
        {
            res ^= nums[i];
        }
        return res;
    }

}
