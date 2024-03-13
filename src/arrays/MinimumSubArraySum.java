package arrays;

public class MinimumSubArraySum {
    public static void main(String[] args) {
        int arr[] = {2,3,1,2,4,3};
        int n = 7;
        System.out.println(getMinSubArray(arr,n));
    }

    static int getMinSubArray(int[] nums,int target){
        int sum=0;
        int min = Integer.MAX_VALUE;
        int j = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            while(sum>=target){
                min = Math.min(min,i-j+1);
                sum = sum-nums[j++];
            }
        }
        return min;
    }
}
