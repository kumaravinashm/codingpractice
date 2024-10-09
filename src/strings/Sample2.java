package strings;
// integer array with 0's all the zeroes to the left
public class Sample2 {
    public static void main(String[] args) {
        int[] arr= {14,0,5,2,21,0,13};
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=0){
                swapValues(arr,j,i);
                j++;
            }
        }

        for(int n:arr){
            System.out.print(n+" ");
        }
    }

    static void swapValues(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j] = temp;
    }
}
