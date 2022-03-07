package com.aapeli.springpattern.microsoft.graph;

import java.util.HashMap;

/**
 * @author jamesoladimeji
 * @created 04/02/2022 - 5:48 AM
 * @project IntelliJ IDEA
 */
public class NumberOfIsland {
    public static void main(String[] args) {

    }

    static int findNumberOfIsland(int[][] grids) {
        int row = grids.length;
        int col = grids[0].length;

        int noOfIsland = 0;

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                //looking for number of island
                //in which and island is representing by 1
                if(grids[i][j] == 1) {
                    //tag the island upon viisting it
                    //and check the four cardinal point of its position
                    markTheCurrentIsland(grids, i, j, row, col);
                    noOfIsland += 1;
                }
            }
        }
        return noOfIsland;
    }

    private static void markTheCurrentIsland(int[][] grids, int x, int y, int row, int col) {
        if(x < 0 || x >= row || y < 0 || y >= col || grids[x][y] != '1')
            return;

        HashMap<Integer, Integer> map = new HashMap<>();
        //map.getOrDefault()

        //in other not to process the this current cell again,
        //lets mark as vivisted
        grids[x][y] = 2;

        //make recursive call in all four adjacent direction
        //of the current cell
        markTheCurrentIsland(grids,x+1, y, row, col); //DOWN
        markTheCurrentIsland(grids, x ,y+1, row, col); //RIGHT
        markTheCurrentIsland(grids, x, y-1, row, col); //LEFT
        markTheCurrentIsland(grids, x - 1, y, row, col); //TOP
    }
}
