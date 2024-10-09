package strings;

import java.util.Locale;

//Longest substring in string without any repeating character.
public class Sample {


    public static void main(String[] args) {
        String input = "bbbbbbbb";
        System.out.println(getLongestNonRepeatingSubString(input));
    }

    static String getLongestNonRepeatingSubString(String s){
        String temp = "";
        int left=0;
        int right=0;
        int result = 0;
        String secondLargest = "";
        char[] charc = s.toCharArray();
        for(int i=0;i<charc.length;i++){
            right = right+1;
            if(!temp.contains(String.valueOf(charc[i]))){
                temp = temp+charc[i];
                if(secondLargest.length()<s.substring(left,right).length()){
                    secondLargest = s.substring(left,right);
                }
            }else{
                left = i;
                temp = "";
            }
        }
        String s1 = "";
        if(s.substring(left,right).length()==secondLargest.length() && s.substring(left,right).equals(secondLargest.length())){
            char c = s.substring(left,right).charAt(0);
            if(secondLargest.contains(String.valueOf(c))){
                s1 = (secondLargest.substring(secondLargest.indexOf(c)+1,secondLargest.length())+s.substring(left,right));
            }
        }else if(s.substring(left,right).length()>secondLargest.length()){
            s1 = s.substring(left,right);
        }else {
            s1 = secondLargest;
        }
        return s1;
    }

}
