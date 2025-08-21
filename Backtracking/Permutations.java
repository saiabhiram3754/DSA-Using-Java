package Backtracking;

public class Permutations{
    public static void findpermutations(String str,String finalstr){
        if(str.length() == 0){
            System.out.println(finalstr);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i+1);
            findpermutations(newstr, finalstr+ch);  
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findpermutations(str," ");
    } 
}