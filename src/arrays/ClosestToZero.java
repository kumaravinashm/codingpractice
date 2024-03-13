package arrays;

public class ClosestToZero {
    public static void main(String[] args) {
        int[] a={-1000,1000};
        System.out.println(getClosestToZero(a));
    }

    static int getClosestToZero(int[] nums){
        int min= Integer.MAX_VALUE;
        for(int i:nums) {
            if(min+i==0){
                min = min>0 ? min : i;
            }else
            if (Math.abs(min)>Math.abs(i)){
                min=i;

            }
        }
        return min;
    }
}
