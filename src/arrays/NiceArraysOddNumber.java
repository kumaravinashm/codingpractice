package arrays;
//https://leetcode.com/problems/count-number-of-nice-subarrays/description/
public class NiceArraysOddNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,2,1,2,2,1,2,2,2} ;
        int k = 2;
        System.out.println(numberOfSubarrays(nums,k));
    }

    public static int numberOfSubarrays(int[] nums, int k) {
        int result = 0;
        for(int i=0;i<nums.length;i++){
            int count = 0;
            for(int j=i;j<nums.length;j++) {

                if (nums[j] % 2 != 0) {
                    count+=1;
                }
                if (count == k) {
                    result+=1;
                    break;
                }
            }
        }
        return result;
    }
}
