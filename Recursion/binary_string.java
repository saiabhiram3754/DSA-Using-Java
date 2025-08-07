package Recursion;

public class binary_string {
    public static void printbinstrings(int num , String str, int lastplace){
        if ( num == 0){
            System.out.println(str);
            return ;
        }
         
        printbinstrings(num-1, str+="0", 0);
        if(lastplace == 0){
            printbinstrings(num-1, str+="1", 1);
        }
    }
    public static void main(String[] args) {
        printbinstrings(3, "", 0);
    }
}
