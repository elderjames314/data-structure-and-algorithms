package com.aapeli.springpattern.microsoft;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author jamesoladimeji
 * @created 08/02/2022 - 4:15 PM
 * @project IntelliJ IDEA
 */
public class TeoSum {

    public static void main(String[] args) {
        int[] nums = {4, 4, 32, 2, 1, 23, 1, 2, 3};
        int k = 34;
        System.out.println(getTwoSum(nums, k));
    }

    static String getTwoSum(int[] arr, int total) {
        HashMap<Integer, Integer> maps = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int rem = total-arr[i];
            if(maps.containsKey(rem)) {
                int[] jj = new int[2];
                jj[0] = maps.get(rem);
                jj[1] = i;
                return Arrays.toString(jj);
            }
            maps.put(arr[i], i);
        }
        return null;
    }

}

