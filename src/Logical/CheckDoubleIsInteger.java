package Logical;

public class CheckDoubleIsInteger {
    public static void main(String[] args) {
        double n = 3454;
        System.out.println(checkInt(n));
    }

    static boolean checkInt(double d){
        if(d%1==0){
            return true;
        }
        else return false;
    }
}
