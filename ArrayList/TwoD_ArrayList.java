package ArrayList;

import java.util.ArrayList;

public class TwoD_ArrayList{
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> MainList = new ArrayList<>();
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        MainList.add(List);

        ArrayList<Integer> List2 = new ArrayList<>();
        List2.add(3);
        List2.add(6);
        List2.add(9);
        List2.add(12);
        List2.add(15);
        MainList.add(List2);

        ArrayList<Integer> List3 = new ArrayList<>();
        List3.add(4);
        List3.add(8);
        List3.add(12);
        List3.add(16);
        List3.add(20);
        MainList.add(List3);

        for(int i = 0; i < MainList.size(); i++){
            ArrayList<Integer> currentList = MainList.get(i);
            for(int j = 0; j< currentList.size(); j++){
                System.out.print(currentList.get(j) +" ");
            }
            System.out.println(" ");
        }
        System.out.println(MainList);
    }
}