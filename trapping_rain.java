// import java.util.*;

public class trapping_rain {
    public static int trapping_rainwater(int height[]){
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < leftMax.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length-1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trapped_water = 0;
        int width = 1;
        for(int i = 0 ; i < height.length ; i++){
            int water_level = Math.min(leftMax[i], rightMax[i]);
            trapped_water = trapped_water + ( water_level  - height[i] ) * width;
        }

        return trapped_water;
    }
     public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("trapped water :" + trapping_rainwater(height));
     }
}


