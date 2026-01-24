import java.util.*;

public class chocola {
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVer[] = {2, 1, 3, 1, 4};
        Integer costHor[] = {4, 1, 2};

        // Sort in descending order
        Arrays.sort(costVer, Comparator.reverseOrder());
        Arrays.sort(costHor, Comparator.reverseOrder());

        int h = 0, v = 0;       // pointers in horizontal and vertical arrays
        int hp = 1, vp = 1;     // number of horizontal and vertical parts
        int cost = 0;

        // Main greedy loop
        while (h < costHor.length && v < costVer.length) {
            if (costVer[v] <= costHor[h]) {   // take horizontal cut
                cost += costHor[h] * vp;
                hp++;
                h++;
            } else {   // take vertical cut
                cost += costVer[v] * hp;
                vp++;
                v++;
            }
        }

        // Remaining horizontal cuts
        while (h < costHor.length) {
            cost += costHor[h] * vp;
            hp++;
            h++;
        }

        // Remaining vertical cuts
        while (v < costVer.length) {
            cost += costVer[v] * hp;
            vp++;
            v++;
        }

        System.out.println("Min cost of cuts: " + cost);
    }
}
