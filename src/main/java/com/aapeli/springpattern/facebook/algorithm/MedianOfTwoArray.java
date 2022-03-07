package com.aapeli.springpattern.facebook.algorithm;

import java.util.Arrays;

/**
 * @author jamesoladimeji
 * @created 20/01/2022 - 3:22 AM
 * @project IntelliJ IDEA
 */
public class MedianOfTwoArray {
    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {2, 3};
        int[] results = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, results, 0, nums1.length);
        System.arraycopy(nums2, 0, results, nums1.length, nums2.length);

        System.out.println(Arrays.toString(results));

       // int m = 8;
       // Double.parseDouble

        //Arrays.sor

        int length = results.length;
        int start = 0;
        int mid = start + ((length - start)/2);
        System.out.println(results[mid]);
        System.out.println(results[mid-1]);
    }


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] results = new int[nums1.length + nums2.length];
        //copy array
        System.arraycopy(nums1, 0, results, 0, nums1.length);
        System.arraycopy(nums2, 0, results, nums1.length, nums2.length);

        //mediam is the middle of the range
        //check if the is odd
        //sort
        Arrays.sort(results);


        int length = results.length;
        if(length == 1) {
            return results[0];
        }
        int start = 0;
        int mid = start + ((length - start)/2);
        if(length % 2 != 0) {
            return Double.parseDouble(""+results[mid]);
        }
        double total = (results[mid] + results[mid - 1])/2.0;
        return total;




    }
}
