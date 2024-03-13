package top50faang;

public class FirstLongestSubstring {


    public static void main(String[] args) {
        String s = "abcdeafghijklmnopqrstuvwxyzkjdbvhqdjkbqkljebgkjqwbndefkbqkjswdbfjqwdkjcbqkjdbckjbdckjwfkbkjwdsbcklwbfkjlcbwiebfkjwbdf";
        System.out.println(getLength(s)[0]);
        System.out.println(getLength(s)[1]);

    }
    
    
    static String[] getLength(String s){
        StringBuilder temp = new StringBuilder();
        String[] arr = new String[2];
        char[] ch = s.toCharArray();
        for (char c:ch){
            if(temp.toString().indexOf(c)==-1){
                temp.append(c);
            }
        }
        arr[0] = String.valueOf(temp.length());
        arr[1] = String.valueOf(temp);
        return arr;
    }

    
}
