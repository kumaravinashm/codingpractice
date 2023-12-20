package strings;

public class IScream {


    public static void main(String[] args) {
        String s1 = "I Scream, You Cream, We All Scream for Ice Scream";
        String s2 = "Cream Ice for Cream All We Scream, You Cream, I";
        String[] sarr = s1.split("\\s+");
        String s="";
        for(int i=sarr.length-1;i>=0;i--){
            String t=sarr[i];
            if(sarr[i].contains("Cream")){
                t= sarr[i].contains(",") ? "Scream," : "Scream";
            }
            if(sarr[i].contains("Scream")){
                t= sarr[i].contains(",") ? "Cream," : "Cream";
            }
            s= s+" "+t;
        }

        System.out.println(s);
    }



}
