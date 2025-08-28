// package Backtracking;

public class Subset {
    public static void FindSubsets(String str,String finalString,int i){

        if(i == str.length()){
            if(finalString.length() ==0){
                System.out.println("null");
            }
            System.out.println(finalString);
            return;
        }

        // recusion Yes choice adding into the final string abc,ab,ac,bc
        FindSubsets(str,finalString+str.charAt(i),i+1);
        //no condition
        FindSubsets(str,finalString,i+1);
    }
    public static void main(String[] args) { 
        String str = "abc";
        FindSubsets(str, "", 0);
    }
}
