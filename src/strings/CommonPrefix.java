package strings;

class CommonPrefix {

    public static void main(String[] args) {
      String[] strs = {"flower","flowertyui","flight"};
        System.out.println(longestCommonPrefix(strs));

    }



    static String longestCommonPrefix(String[] s) {

        String result = s[0];
        if(s.length==1){
            return result;
        }
        for (String s1:s){
            while (s1.indexOf(result)!=0){
                result = result.substring(0,result.length()-1);
                if(result.isEmpty()){
                    return "-1";
                }
            }
        }
        return result;
    }
}