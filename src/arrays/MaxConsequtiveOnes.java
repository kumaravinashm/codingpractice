package arrays;

public class MaxConsequtiveOnes {

    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1,0,1,1,1,1,0,8,7,1,1,1,1,1,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }


    static int findMaxConsecutiveOnes(int[] nums) {
        int ones = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) {
                ones = ones + 1;
            }else{
                if(count<ones)count = ones;
                ones = 0;
            }
            if(count<ones)count = ones;
        }
        return count;
    }
}
