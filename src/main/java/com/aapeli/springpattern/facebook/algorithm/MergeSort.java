package com.aapeli.springpattern.facebook.algorithm;

import java.util.Arrays;

/**
 * @author jamesoladimeji
 * @created 20/01/2022 - 1:48 PM
 * @project IntelliJ IDEA
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] myarr = {4,3, 2, 6, 7, 1, 3};
        System.out.println(twoPoint(myarr));
        //mergeSort(myarr, myarr.length);
       // System.out.println(Arrays.toString(myarr));
    }

    public static int twoPoint(int[] arr) {
        int i = 0; int j = i + 2;
        while (j < arr.length) {
            i++;
            j += 2;
        }
        return arr[i];
    }

    public static void mergeSort(int[] a, int n) {

        Arrays.copyOf(a, a.length);

        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
