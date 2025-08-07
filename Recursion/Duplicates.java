package Recursion;

public class Duplicates {
    public static void Duplicate(String s1, int index,boolean map[]){
        StringBuilder sb  = new StringBuilder();
        if ( index == s1.length()){
            System.out.println(sb);
            return;
        }
        char ch = s1.charAt(index);
        if(map[ch - 'a'] == true ){

            // duplicates are present
            Duplicate(s1,index+1,map);
        }
        else {
            map[ch-'a'] = true;
            sb.append(ch);
            Duplicate(s1,index+1,map);
        }
    } 
    public static void main(String[] args) {
        String s1 = "abhiram";
        Duplicate(s1,0,new boolean[256]);
    }
}
