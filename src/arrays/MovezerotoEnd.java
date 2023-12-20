package arrays;

public class MovezerotoEnd {

    public static void main(String[] args) {
        int[] arr = {1,0, 2, 3, 4, 0, 5, 6, 0, 0, 0, 7, 8, 9, 10, 0, 8, 67, 76, 8, 9, 0};
        int n=arr.length,c =0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[c++] = arr[i];
            }
        }
        System.out.println("wd");
    }

}
