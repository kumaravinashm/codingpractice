package arrays;

import java.io.*;
import java.math.*;

class PrintLastKDigitsOfProduct {

    public static void main(String[] args)
    {
        int[] a = { 22, 31, 44, 27, 37, 43 };
        int k = 2;
        int n = a.length;
        System.out.println(lastKDigits(a, n, k));
    }

    static int lastKDigits(int[] a,int n,int k){
        int digits = (int) Math.pow(10,k);
        int mul = a[0]%digits;
        for(int i=1;i<a.length;i++){
            a[i] = a[i]%digits;
            mul = (a[i]*mul)%digits;
        }
        return mul;
    }

}
