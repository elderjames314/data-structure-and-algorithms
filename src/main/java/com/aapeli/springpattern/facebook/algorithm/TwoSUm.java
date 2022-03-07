package com.aapeli.springpattern.facebook.algorithm;

import java.util.Arrays;

/**
 * @author jamesoladimeji
 * @created 20/01/2022 - 2:51 AM
 * @project IntelliJ IDEA
 */
public class TwoSUm {
    public static void main(String[] args) {
        int[] numnes =  {2,7,11,15};
        int [] nums = {2, 4, 3};
        int[] result = new int[numnes.length + nums.length];
        int target = 9;
        //System.out.println(Arrays.toString(twoSum(numnes, target)));

        int[] nums3 = Arrays.copyOf(numnes, 4);
        nums3 = Arrays.copyOf(nums,3);
       // System.out.println(Arrays.toString(nums3));

        //arraycopy

        System.arraycopy(numnes,0,result, 0, numnes.length);
        System.arraycopy(nums, 0, result, numnes.length, nums.length);

       // System.out.println(Arrays.toString(result));




        int[] merge = new int[numnes.length + nums.length];

        int pos = 0;
        for(int el : numnes) {
            merge[pos++] = el;
        }
        for(int el : nums) {
            merge[pos++] = el;
        }
        System.out.println(Arrays.toString(merge));







    }


    //efficient approach
    public static int[] twoSum1(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int[] result = new int[2];
            int sum = nums[i] + nums[j];
            if(target == sum) {
                result[0] = i;
                result[1] = j;
                return result;
            }else if( sum < target)
                i = i + 1;
            else
                j = j - 1;

        }
        return new int[2];
    }


    //brute force approach
    public static int[] twoSum(int[] nums, int target) {
        //one pointer at each
        //brute force approach
        for(int i = 0; i < nums.length; i++) {

            for(int j = i + 1; j < nums.length; j++) {

                if(nums[i] + nums[j] == target) {
                    int[] result = new int[2];
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }

        }

        return new int[2];

    }
}
