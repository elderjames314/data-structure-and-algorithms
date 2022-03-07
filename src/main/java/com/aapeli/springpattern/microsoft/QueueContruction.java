package com.aapeli.springpattern.microsoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author jamesoladimeji
 * @created 05/02/2022 - 8:14 AM
 * @project IntelliJ IDEA
 */
public class QueueContruction {
    public static void main(String[] args) {
        int[][] arr = {{4, 2}, {4, 5} };

        System.out.println(reconstructQueue(arr));
    }

    public static int[][] reconstructQueue(int[][] people) {
        List<int[]> results = new ArrayList<>();

        Arrays.sort(people, (a, b) -> {
            return a[0]==b[0] ? a[1] - b[1] : a[0] - b[0];
        });

        for(int[] x : people) {
            results.add(x[1], x);
           // results.ad
        }

        return results.toArray(new int[people.length][2]);
    }
}
