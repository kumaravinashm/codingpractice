package arrays;

public class MergeTwoSortedArray {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int n1 =3;

        int[] arr2 = {2,5,6};
        int n2 = arr2.length;

        int[] arr3 = new int[n1+n2];
        arr3 = mergeArrays(arr1,n1,arr2,n2);


        for (int i=0; i < n1+n2; i++)
            System.out.print(arr3[i] + " ");
    }


    static int[] mergeArrays(int[] nums1, int n1, int[] nums2, int n2){
        int i=0,j=0,k=0;
        int[] c = new int[n1+n2];
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j] || nums1[i]==nums2[j]){
                c[k]=nums1[i];
                i++;
            }else if(nums1[i]>nums2[j]){
                c[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            c[k]=nums1[i];
            k++;
            i++;

        }
        while(j<n2){
            c[k]=nums2[j];
            k++;
            j++;
        }
        for(int l=0;l<c.length;l++){
            nums1[l] = c[l];
        }
        return c;
    }

}



