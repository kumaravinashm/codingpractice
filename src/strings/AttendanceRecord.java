package strings;

import java.util.HashMap;

public class AttendanceRecord {
    public static void main(String[] args) {
        String s = "LALL";
        System.out.println(getAward(s));
    }

    static boolean getAward(String s){
        int absent = 0;
        int late = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'A'){
                absent++;
                if(absent >= 2){
                    return false;
                }
                late = 0;
            }
            else if(s.charAt(i) == 'L'){
                late++;
                if(late >= 3){
                    return false;
                }
            }
            else{
                late = 0;
            }
        }
        return true;
    }

}
