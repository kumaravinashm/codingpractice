package strings;

import java.sql.Array;
import java.util.Arrays;

public class StringAnagram {


    public static void main(String[] args) {
        char[] a = "geeksforgeeks".toCharArray();
        char[] b = "forgeeksgeeks".toCharArray();
        System.out.println(isAnagram(a,b));
    }
    public static boolean isAnagram(char[] str1,char[] str2)
    {
        int num_of_char = 256;
        int[] count1 = new int[num_of_char];
        int[] count2 = new int[num_of_char];
        Arrays.fill(count1,0);
        Arrays.fill(count2,0);
        int i;

        if(!(str1.length==str2.length))
        {
            return false;
        }
        for(i=0;i<str1.length;i++){
            count1[str1[i]]++;
            count2[str2[i]]++;
        }
        for (i = 0; i < num_of_char; i++)
            if (count1[i] != count2[i])
                return false;

        return true;
    }


}
