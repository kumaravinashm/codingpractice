package arrays;

public class SecondLargestOccurenceOfCharacter
{
    static final int NO_OF_CHARS = 256;

    // finds the second most frequently occurring
    // char
    static char getSecondMostFreq(String str)
    {
        int[] count = new int[256];
        int i;
        for(i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
        int first=0,second=0;
        for(i=0;i<count.length;i++){
            if(count[i]>count[first]){
                second = first;
                first = i;
            }else if(count[i]>count[second] && count[i]!=count[first] ){
                second = i;
            }
        }
        return (char)second;

    }

    // Driver program to test above function
    public static void main(String args[])
    {
        String str = "geeksforgeeks";
        char res = getSecondMostFreq(str);
        if (res != '\0')
            System.out.println("Second most frequent char"+
                    " is " + res);
        else
            System.out.println("No second most frequent"+
                    "character");
    }
}