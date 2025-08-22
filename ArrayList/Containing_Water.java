package ArrayList;

import java.util.ArrayList;

public class Containing_Water {
    public static int StoreWater(ArrayList<Integer> List){
        //brute force

    //     int maxWater = 0;
    //     for(int i = 0; i<List.size(); i++){
    //         for(int j = i+1; j< List.size(); j++){
    //             int ht = Math.min(List.get(i), List.get(j));
    //             int wd = j-i;
    //             int currWater = ht * wd;
    //             maxWater = Math.max(maxWater, currWater);
    //         }
    //     }
    //     return maxWater;
    // }

    // two -pointer approach    -- left pointer, rigth pointer

    int maxWater = 0;
    int left = 0;
    int Right = List.size() - 1;

    while(left < Right){
        int wd = Right -left;
        int ht = Math.min(List.get(left), List.get(Right));
        int currentWater = ht * wd;
        maxWater = Math.max(maxWater,currentWater);
        if(List.get(left) < List.get(Right)){
            left ++ ;
        } else {
            Right -- ;
        }
    }
    return maxWater;
}

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();

        List.add(1);
        List.add(8);
        List.add(6);
        List.add(2);
        List.add(5);
        List.add(4);
        List.add(8);
        List.add(3);
        List.add(7);

        System.out.println(StoreWater(List));
    }
}
