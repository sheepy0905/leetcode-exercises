package org.sheepy.leetcode;

public class LC695MaxAreaOfIsland {
  public int maxAreaOfIsland(int[][] grid) {
    boolean[][] seen = new boolean[grid.length][grid[0].length];
    int max = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == 1) {
          max = Math.max(max, calcArea(grid, seen, i, j));
        }
      }
    }
    return max;
  }

  public int calcArea(int[][] grid, boolean[][] seen, int r, int c) {
    if (r < 0 ||
        r > grid.length - 1 ||
        c < 0 ||
        c > grid[0].length - 1 ||
        seen[r][c] ||
        grid[r][c] == 0) {
      return 0;
    }

    seen[r][c] = true;
    return (1 + calcArea(grid, seen, r - 1, c) + calcArea(grid, seen, r + 1, c) + calcArea(grid, seen, r, c - 1) + calcArea(grid, seen, r, c + 1));
  }
}
