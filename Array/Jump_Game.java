import java.util.*;

public class Jump_Game {
    public static void main(String[] args) {
        int array[] = {2, 3, 1, 1, 4};
        System.out.println(canJump(array));  // prints true
    }

    public static boolean canJump(int[] array) {
        int maxJump = 0;

        for (int i = 0; i < array.length; i++) {
            if (i > maxJump) {
                return false;  // can't reach this position
            }
            maxJump = Math.max(maxJump, i + array[i]);
            if (maxJump >= array.length - 1) {
                return true;  // can reach or go beyond last index
            }
        }
        return true;
    }
}
