package ArrayList;

import java.util.ArrayList;

public class Initial {
    public static void main(String[] args) {
        //java collection framework
        // Classname ObjectName= new Classname(); 
        ArrayList<Integer> List = new ArrayList<>();
        ArrayList<String> str = new ArrayList<>();
        ArrayList<Boolean> bool = new ArrayList<>();

        //add operation - O(1)
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);

        List.add(4, 55);  //O(n) shift all the elements and insert at that position

        System.out.println(List.size());
        
        //print traverse
        for (int i = 0; i < List.size(); i++) {
            System.out.print(List.get(i) + " ");
        }

        // System.out.print(List);
        
        // get Operation - O(1)
        // int element = List.get(3);
        // System.out.print(element);

        //remove -- O(n)
        // List.remove(1);
        // System.out.print(List);

        //set element at position
        // List.set(2, 10);
        // System.out.print(List);

        // contains the element or not
        // System.out.println(List.contains(4));
        // System.out.print(List.contains(7));
    }
}
