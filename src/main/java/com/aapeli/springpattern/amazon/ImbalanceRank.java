package com.aapeli.springpattern.amazon;

import sun.lwawt.macosx.CSystemTray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author jamesoladimeji
 * @created 17/02/2022 - 12:46 PM
 * @project IntelliJ IDEA
 */
public class ImbalanceRank {
    public static void main(String[] args) {

        List<Integer> ranks = new ArrayList<>();
        ranks.add(4);
        ranks.add(1);
        ranks.add(3);
        ranks.add(2);

        System.out.println(findTotalImbalance(ranks));

    }


    public static long findTotalImbalance(List<Integer> ranks) {

        int totalImbalance = 0;

        for(int i = 0; i < ranks.size(); i++) {
            List<Integer> grouped = new ArrayList<>();
           for(int j = i; j < ranks.size(); j++) {
               grouped.add(ranks.get(j));
           }
            //convert list to array first
            Integer[] sortedRanks = grouped.stream().toArray(Integer[]::new);
            //sort it ascending order
            Arrays.sort(sortedRanks);
            for (int k : sortedRanks) {
                System.out.print(k +", ");
            }
            if(sortedRanks.length > 1) {
                for (int x = 1; x < sortedRanks.length; x++) {
                    if(sortedRanks[x] - sortedRanks[x - 1] > 1) totalImbalance++;
                }
            }

            System.out.println("*******************");
           //clear the list when you are done with this group.
           grouped.clear();
        }


        for(int i = 0; i < ranks.size(); i++) {
           // for(int j = 0)
        }

        return totalImbalance;





    }

}
