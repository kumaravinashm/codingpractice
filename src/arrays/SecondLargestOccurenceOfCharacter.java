package arrays;

public class SecondLargestOccurenceOfCharacter
{
    static final int NO_OF_CHARS = 256;

    // finds the second most frequently occurring
    // char
    static char getSecondMostFreq(String str)
    {
        int[] chars = new int[256];
        int i=0,first=0,second=0;
        for(i=0;i<str.length();i++){
            chars[str.charAt(i)]++;
        }
        for(i=0;i<chars.length;i++){
            if(chars[i]>chars[first]){
                second = first;
                first = i;
            }else if (chars[i] > chars[second] &&
                    chars[i] != chars[first]) {
                second = i;
            }
        }
        return (char)second;


    }

    // Driver program to test above function
    public static void main(String args[])
    {
        String str = "geeksforgeekseeeeeeeeeeetttt";
        char res = getSecondMostFreq(str);
        if (res != '\0')
            System.out.println("Second most frequent char"+
                    " is " + res);
        else
            System.out.println("No second most frequent"+
                    "character");
    }
}