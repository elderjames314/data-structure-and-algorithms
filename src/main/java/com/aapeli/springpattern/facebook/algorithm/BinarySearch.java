package com.aapeli.springpattern.facebook.algorithm;

/**
 * @author jamesoladimeji
 * @created 19/01/2022 - 4:27 PM
 * @project IntelliJ IDEA
 */
public class BinarySearch {
    public static void main(String[] args) {


        int[] scores = {-1,0,3,5,9,12};
        System.out.println(binarySearchIterative(scores, 9));
        System.out.println(binarySearchRecursive(scores, 9, 0, scores.length-1));

    }



    static int binarySearchRecursive(int[] array, int x,  int left, int right) {
        if(left > right) return -1;
        int mid = left + ((right - left)/2);
        if(x == array[mid]) {
            return mid;
        }else if(x > array[mid]) {
            return binarySearchRecursive(array, x, mid + 1, right);
        }else
            return binarySearchRecursive(array, x, left, mid - 1);
    }


    static int binarySearchIterative(int[] array, int x) {

        int length = array.length;
        int left = 0;
        int right = length - 1;
        while (left <=  right) {
            int mid = left + ((right - left) / 2);
            if(x == array[mid]) {
                return mid;
            }else if(x > array[mid]) {
                left = mid +  1;
            }else {
                right = mid - 1;
            }
        }
        return -1;





    }
}
