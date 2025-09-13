// import java.util.*;

// public class Activity_Selection{
//     public static void main(String[] args){ //O(nlogn)
//         int[] start = {1,3,0,5,8,5};
//         int[] end = {2,4,6,7,9,9};

//         int maxAct = 0;
//         ArrayList<Integer> ans = new ArrayList<>();

//         //end time basics sorting
//         maxAct = 1;
//         ans.add(0);
//         int lastend = end[0];

//         for(int i=1; i<end.length; i++){
//             while(start[i] >= lastend){
//                 maxAct++;
//                 ans.add(i);
//                 lastend = end[i];
//             }
//         }

//         System.out.println("Max activity :" + maxAct);
//         for(int i = 0; i<ans.size();i++){
//             System.out.print("A" + ans.get(i) +" ");
//         }
//         System.out.println();
//     }
// }


import java.util.*;

public class Activity_Selection {
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        int[][] activities = new int[start.length][3];  

        // Fill activities array
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;       // activity index
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // Sort by end time
        Arrays.sort(activities, Comparator.comparingInt(o -> o[2]));

        // Select activities
        ArrayList<Integer> ans = new ArrayList<>();

        int maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for (int i = 1; i < start.length; i++) {
            if (activities[i][1] >= lastEnd) {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        // Output result
        System.out.println("Max activities: " + maxAct);
        for (int idx : ans) {
            System.out.print("A" + idx + " ");
            // A0 A1 A3 A4
        }
        
        System.out.println();
    }
}
