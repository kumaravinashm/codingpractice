package arrays;

import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int arr[] = {4, 8, 5, 9, 7, 10, 7, 3};
        System.out.println(ifDuplicates(arr));
    }

    static boolean ifDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) return true;
            else set.add(arr[i]);
        }
        return false;
    }
}

