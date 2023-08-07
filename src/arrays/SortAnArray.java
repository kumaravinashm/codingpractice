package arrays;

public class SortAnArray {
    public static void main(String[] args) {
        int arr[] = {4, 8, 5,9, 7,10,5,7,3};
        sort(arr);
    }

    static int[] sort(int[] a){
        for(int i=0;i<a.length;i++){

            for(int j=i+1;j<a.length;j++){
                int temp=0;
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] =a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}
