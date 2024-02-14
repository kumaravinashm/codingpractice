package Logical;

public class Swap2Numbers {

    public static void main(String[] args) {
        int x=48,y=89;
        swap(x,y);
    }
    static void swap(int x,int y){
        x = x+y;
        y=x-y;
        x=x-y;
        System.out.println(x+" "+y);
    }
}
