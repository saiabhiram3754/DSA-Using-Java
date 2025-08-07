// package string;

public class largestr {

    public static boolean great(String largestring, String str2){
        int n = largestring.length();
        int m = str2.length();
        int minlen = Math.min(n, m);
        // System.out.println(minlen);
        int j = 0;
        for (; j < minlen;) {
            char ch = largestring.charAt(j);
            char ch2 = str2.charAt(j);
            if(ch == ch2 ){
                j++;
            }
            else if(ch>ch2){
                return true;
            }
            else{
                return false;
            }
        }
        return n>m;
    }

    public static void main(String args[]){
        String str[] = {"apple","amma","mango","no"};
        String largestring = str[0];
        // System.out.println(great(largestring, str[1]));

        for (int i = 1; i < str.length; i++){
            if(great(str[i],largestring)){
                largestring = str[i];
            }
        }
        System.out.println(largestring);
    }
}

