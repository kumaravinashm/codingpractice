package strings;

class CommonPrefix {

    public static void main(String[] args) {
      String[] strs = {"flower","flowe","flight"};
        System.out.println(longestCommonPrefix(strs));

    }



    static String longestCommonPrefix(String[] s) {
        if(s.length==1){
            return s[0];
        }
        String r = s[0];
        for(int i=1;i<s.length;i++){
            while(s[i].indexOf(r)!=0){
                r = r.substring(0,r.length()-1);
                if(r.isEmpty()){
                    return "-1";
                }
            }
        }
        return  r;
    }
}