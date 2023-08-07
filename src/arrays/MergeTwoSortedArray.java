package arrays;

public class MergeTwoSortedArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int n1 = arr1.length;

        int[] arr2 = {2, 4, 6, 8};
        int n2 = arr2.length;

        int[] arr3 = new int[n1+n2];
        mergeArrays(arr1,n1,arr2,n2,arr3);


        for (int i=0; i < n1+n2; i++)
            System.out.print(arr3[i] + " ");
    }


    static void mergeArrays(int[] a, int n1, int[] b, int n2,int[] c){
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(a[i]<b[j]){
                c[k++] = a[i++];
            }else {
                c[k++] = b[j++];
            }
        }

        while(i<n1){
            c[k++]=a[i++];
        }
        while(j<n1){
            c[k++]=b[j++];
        }


    }

}
