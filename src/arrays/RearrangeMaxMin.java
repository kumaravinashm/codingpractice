package arrays;

import java.util.Arrays;

public class RearrangeMaxMin {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] temp = arr.clone();
        int n = arr.length;
        int small=0,large=n-1;
        Boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (flag)
                arr[i] = temp[small++];
            else
                arr[i] = temp[large--];

            flag = !flag;
        }
        System.out.println(Arrays.toString(arr));

    }

}
