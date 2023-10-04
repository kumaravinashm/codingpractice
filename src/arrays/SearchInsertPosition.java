package arrays;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 6};
        int n = 7;
        System.out.println(searchPos(a,n));

    }

    static int searchPos(int[] a,int n){

        for(int i=0;i<a.length;i++){
            if(a[i]==n){
                return i;
            } else if(a[i]>n){
                return i;
            } else if(i==a.length-1){
                return i+1;
            }

        }
        return 0;

    }
}
