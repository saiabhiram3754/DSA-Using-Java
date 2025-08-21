package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class BasicQuestions {
    public static void Swap(ArrayList<Integer> List, int idx1, int idx2){
        int temp = List.get(idx1);
        List.set(idx1, List.get(idx2));
        List.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(2);
        List.add(5);
        List.add(9);
        List.add(1);

        //reverse Print

        // for(int i = List.size() - 1; i >= 0; i--){
        //     System.out.print(List.get(i) + " ");
        // }

        // Maximum number 
        // int max = Integer.MIN_VALUE;
        // for (int i = 0; i < List.size(); i++) {
        //     if(max < List.get(i)){
        //         max = List.get(i);
        //     }
        //     max = Math.max(max, List.get(i));
        // }
        // System.out.print(max);

        // Swap of 2 numbers
        // int idx1 = 1, idx2 = 3;
        // System.out.println(List + " ");
        // Swap(List, idx1, idx2);
        // System.out.print(List+" ");

        //sorting numbers
        System.out.println(List);
        Collections.sort(List);     //ascending order
        System.out.println(List);

        Collections.sort(List, Collections.reverseOrder());  // descering order
        //comparator -- funx Logic it defines the logic
    }
}
