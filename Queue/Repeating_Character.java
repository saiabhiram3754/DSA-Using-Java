import java.util.*;

public class Repeating_Character{
    public static void RepeatingChar(String str){
        int freq[] = new int[26];
        Queue<Character> q1 = new LinkedList<>();
        
        for(int i = 0; i <str.length(); i++){
            char ch = str.charAt(i);

            q1.add(ch);
            freq[ch - 'a']++;

            while(!q1.isEmpty() && freq[q1.peek() - 'a'] >1){
                q1.remove();
            }

            if(q1.isEmpty()){
                System.out.print(-1 +" ");
            } else {
                System.out.print(q1.peek() +" ");
            }
        }

        System.out.println();
    }
    public static void main(String [] args){
        String str = "aabccxb";
        RepeatingChar(str);
    }
}