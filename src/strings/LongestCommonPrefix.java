package strings;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] arr = {"d", "d", "d",
                "d"};
        System.out.println(getPrefix(arr));
    }

    static String getPrefix(String[] arr){
        int minStringLength = findMinimumLengthOfString(arr, arr.length);
        char tempC;
        String result ="";
        for(int i=0;i<minStringLength;i++){
            tempC = arr[0].charAt(i);
            for(int j=1;j< arr.length;j++){
                if(arr[j].charAt(i)!=tempC){
                    if(result.length()>0) {
                        return result;
                    }else return "-1";
                }
            }
            result = result+tempC;
        }
        return result;
    }

    static int findMinimumLengthOfString(String arr[], int n){
        int min = arr[0].length();
        for (String s:arr) {
            if(s.length()<min){
                min = s.length();
            }
        }
        return min;
    }

}
