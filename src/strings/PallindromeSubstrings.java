package strings;



//Given a string, split it into as few strings as possible such that each string is a palindrome.
//        "racecarkayakanna" ==> "racecar","kayak","anna"

import java.util.ArrayList;
import java.util.HashSet;

public class PallindromeSubstrings {
    public static void main(String[] args) {
        String s = "racecarkayakaanna";
//        for(String s1:getSubstrings(s)){
//            System.out.println(s1);
//        }
        System.out.println(primePalindrome(9989900));
    }

    static ArrayList<String> getSubstrings(String s){
        String t = "";
        ArrayList<String> arr = new ArrayList<>();
        for(char c:s.toCharArray()){
            t=t+c;
            if(t.length()!=1) {
                if (isPallindrome(t)) {
                    arr.add(t);
                    t = "";
                }
            }
        }
        return arr;
    }

    static boolean isPallindrome(String s){
        if(s.length()==1 || s.length()==0) return false;
        int i=0;
        int j=s.length()-1;
        while (i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }


    static ArrayList<String> getaSubstrings(String s){
        String t = "";
        ArrayList<String> arr = new ArrayList<>();
        int j=0;
        int i=0;
        for( i=0;i<s.length()+2;i++){
            int k=i;
            for(j=k;j<s.length()+1;j++){
                t = s.substring(i,j);
                if(isPallindrome(t)){
                    arr.add(t);
                    t="";
                    i=j;
                }
            }
        }
        return arr;
    }

    static int primePalindrome(int n) {
        boolean f = true;
        while(f){
            if(isPrime(n)){
                if(isPallindrome(n)){
                    f=false;
                }else {
                    n++;
                }
            }
            else{
                n++;
            }
        }
        return n;
    }


    static boolean isPrime(int n)
    {

        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;

        return true;
    }
    static boolean isPallindrome(int n)
    {
        int t = n;
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n = n / 10;
        }
        return t == reversed;
    }





}
