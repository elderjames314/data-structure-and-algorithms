package com.aapeli.springpattern.microsoft;

import com.aapeli.springpattern.newdesign.structuraldesign.proxy.RealSubjectClass;

/**
 * @author jamesoladimeji
 * @created 01/02/2022 - 6:07 PM
 * @project IntelliJ IDEA
 */
public class LongestLength {

    public static void main(String[] args) {
        String X="OldSite:GeeksforGeeks.org";
        String Y="NewSite:GeeksQuiz.com";

        System.out.println(longestLength(X,Y,X.length()-1, Y.length()-1));
    }



    static int longestLength(String X, String Y, int m, int n) {

        int[][] LCF = new int[m + 1][n + 1];

        int result = 0;

        for(int i = 0; i< m; i++) {
            for(int j = 0; j< n; j++) {
                if(i == 0 || j == 0) {
                    LCF[i][j] = 0;
                }else if(X.charAt(i - 1) == Y.charAt(j - 1)) {
                    LCF[i][j] = LCF[i-1][j-1] + 1;
                    result = Integer.max(result, LCF[i][j]);

                }else {
                    LCF[i][j] = 0;
                }
            }
        }

        return result;

    }

}


