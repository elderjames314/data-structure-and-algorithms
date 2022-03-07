package com.aapeli.springpattern.facebook.algorithm;

/**
 * @author jamesoladimeji
 * @created 23/01/2022 - 3:20 PM
 * @project IntelliJ IDEA
 */
public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {

        int left = 0;
        int right = nums.length -1;

        while(left < right) {
            int mid = left + (right - left)/2;

            if(nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return left;


    }

}
