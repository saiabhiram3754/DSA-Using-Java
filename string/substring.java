// package string;

public class substring {
    public static String substringfunction(String str,int si ,int ei){
        String substring = "";
        for (int i = si; i < ei; i++) {
            substring += str.charAt(i);
        }
        return substring;  
    }

    
    public static void main(String[] args) {
        String str = "helloworld";
        // System.out.println(str.substring(0, 5));
        System.out.print(substringfunction(str, 0, 5));
    }
}
