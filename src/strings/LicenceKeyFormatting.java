package strings;

public class LicenceKeyFormatting {

    public static void main(String[] args) {
        String s = "5F3Z-2e-9-w-ph";
        int k = 4;
        System.out.println(format(s,k));

    }

    static String format(String s, int k){
        String s1=(s.replace("-",""));
        StringBuilder s2 = new StringBuilder();
        int count = 0;
            for(int i=s1.length()-1;i>=0;i--){
                if(count==k){
                    s2.append("-");
                    count=0;
                }
                s2.append(s1.charAt(i));
                count++;
            }

        return s2.reverse().toString().toUpperCase();

    }
}
