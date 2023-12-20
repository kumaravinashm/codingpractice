package arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int n  = 3;

        System.out.println(removeDuplicate(nums));
    }

    public static int removeDuplicate(int[] nums) {
        int j=1;
        for(int i=2;i<nums.length;i++)
            if(nums[i]!=nums[j-1])
                nums[++j]=nums[i];
        return j+1;
    }


}
