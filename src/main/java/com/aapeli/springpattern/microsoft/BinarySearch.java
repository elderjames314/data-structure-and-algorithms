package com.aapeli.springpattern.microsoft;

import java.util.Arrays;

/**
 * @author jamesoladimeji
 * @created 31/01/2022 - 8:37 PM
 * @project IntelliJ IDEA
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {4, 3, 23, 5, 3, 2, 3, 2, 3};
        int x = 5;
        Arrays.sort(arr);
        System.out.println(findNumber(arr, x));
    }

    static boolean findNumber(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left)/2;
            if(arr[mid] == x) {
                return true;
            }else if(x > arr[mid])
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }
}
