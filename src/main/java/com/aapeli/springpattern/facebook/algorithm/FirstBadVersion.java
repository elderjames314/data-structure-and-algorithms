package com.aapeli.springpattern.facebook.algorithm;

/**
 * @author jamesoladimeji
 * @created 19/01/2022 - 7:33 PM
 * @project IntelliJ IDEA
 */
public class FirstBadVersion {
    public static void main(String[] args) {

    }
    boolean isBadVersion(int n) {
        return true;
    }
    public int firstBadVersion(int n) {

        int left = 0;
        int right = n;

        while(left <= right) {
            int mid = left + ((right - left)/2);

            if(isBadVersion(mid) && !isBadVersion(mid - 1)) {
                return mid;
            }else if(isBadVersion(mid) && isBadVersion(mid - 1)) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }

        }
        return -1;
    }
}
