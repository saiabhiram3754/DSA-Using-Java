package ArrayList;

import java.util.ArrayList;

public class PairSum {
    // brute force

    // public static boolean pairsum(ArrayList<Integer> List,int target){
    //     for (int i = 0; i < List.size(); i++) {
    //         for(int j = 0; j < List.size(); j++){
    //             if(List.get(i) + List.get(j) == target){
    //                 return true;
    //             }
    //         }            
    //     }
    //     return false;
    // }

    //two pointers

    // public static boolean pairsum(ArrayList<Integer> List,int target){
    //     int left = 0;
    //     int right = List.size() - 1;
    //     while(left < right){
    //         if (List.get(right)+List.get(left) == target){
    //             return true;
    //         }
            
    //         if(List.get(right)+List.get(left) < target){
    //             left ++;
    //         } else {
    //             right --;
    //         }
    //     }
    //     return false;
    // }

    // sorted + Roated array [11,15,6,7,8,9,10]
    public static boolean pairsum(ArrayList<Integer>List2,int target){
        int bp = -1;
        for (int i = 0; i < List2.size(); i++) {
            if(List2.get(i) > List2.get(i+1)){        //breaking point
                bp = i;                     // 1
                break;
            }
        }

        int leftpointer = bp +1;
        int rightpointer = bp;
        while(leftpointer != rightpointer){
            if(List2.get(leftpointer) + List2.get(rightpointer) == target){
                return true;
            }

            if(List2.get(leftpointer) +  List2.get(rightpointer) < target){
                leftpointer = (leftpointer + 1) % List2.size();
            } else {
                rightpointer = (List2.size() + rightpointer - 1) % List2.size();
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);

        ArrayList<Integer> List2 = new ArrayList<>();
        List2.add(11);
        List2.add(15);
        List2.add(6);
        List2.add(7);
        List2.add(8);
        List2.add(9);
        List2.add(10);
        // System.out.println(pairsum(List, 11));
        System.out.println(pairsum(List2, 16));
    }
}
