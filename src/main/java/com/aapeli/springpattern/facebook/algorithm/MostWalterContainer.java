package com.aapeli.springpattern.facebook.algorithm;

/**
 * @author jamesoladimeji
 * @created 22/01/2022 - 2:25 PM
 * @project IntelliJ IDEA
 */
public class MostWalterContainer {

    public static void main(String[] args) {
        int[] containers = {1,8,6,2,5,4,8,3,7};
        System.out.println(getMaxArea2(containers));
    }

    public static int getMaxArea(int[] height) {

        int totalMax = 0;
        for (int i = 0; i < height.length; i++) {
            for(int j = 0; j < height.length; j++) {
                int min = Math.min(height[i], height[j]);
                int area = (j - i) * min;
                totalMax = Math.max(totalMax, area);
            }
        }
        return totalMax;

    }

    public static int getMaxArea2(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int totalArea = 0;
        while (left < right) {
            int temp = 0;
            int minHeight = Math.min(height[left], height[right]);
            if(minHeight  == height[left]) {
                temp = (right - left) * minHeight;
                left++;
            } else {
                temp = (right - left) * minHeight;
                right--;
            }
            if(totalArea <  temp)
                totalArea = temp;

        }
        return totalArea;
    }


}
