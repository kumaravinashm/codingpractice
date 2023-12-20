package arrays;

public class RemoveElementFromArrayAddDashAtEnd {

    public static void main(String[] args) {
        int[] nums = {3,2,2,3,4,5,6,5,3,3,3,4,3,4,3,4,5,3,4,3,3,6,6};
        int n  = 3;

        System.out.println(getArray(nums,n));
    }

    static int[] getArray(int[] nums,int n){
        int b=nums.length,c =0;
        for(int i=0;i<b;i++){
            if(nums[i]!=n){
                nums[c++] = nums[i];
            }
        }
        return nums;
    }

}
