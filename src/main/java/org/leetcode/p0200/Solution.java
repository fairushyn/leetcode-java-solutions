package org.leetcode.p0200;

public class Solution {
    public int numIslands(char[][] grid) {
        int numIslands = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[0].length; column++) {
                if (grid[row][column] == '1') {
                    numIslands++;
                    dfs(row, column, grid);
                }
            }
        }
        return numIslands;
    }

    private void dfs(int row, int column, char[][] grid) {
        if (row < 0 || column < 0 || row >= grid.length || column >= grid[0].length || grid[row][column] == '0') {
            return;
        }

        grid[row][column] = '0';
        dfs(row -1, column, grid);
        dfs(row, column-1, grid);
        dfs(row, column+1, grid);
        dfs(row+1, column, grid);
    }
}
