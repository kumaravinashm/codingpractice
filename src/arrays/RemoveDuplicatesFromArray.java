package arrays;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
        int[] a = {1,4,4,5,6,7,8,8,8,9};
        System.out.println(removeDuplicates(a));
    }


    static int removeDuplicates(int[] nums) {
        int count =1;
        int index = 1;
        for(int i=1;i<=nums.length-1;i++){
            if(nums[i]!=nums[i-1]){
                count++;
                nums[index]= nums[i];
                index++;
            }

        }
        return count;
    }
}
