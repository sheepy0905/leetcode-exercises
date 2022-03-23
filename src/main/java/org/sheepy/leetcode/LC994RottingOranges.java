package org.sheepy.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class LC994RottingOranges {
  public int orangesRotting(int[][] grid) {
    int m = grid.length, n = grid[0].length;
    int freshCount = 0;
    Queue<int[]> queue = new LinkedList<>();
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] == 2) {
          queue.offer(new int[]{i, j});
        } else if (grid[i][j] == 1) {
          freshCount++;
        }
      }
    }
    int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    int minutes = 0;
    while(!queue.isEmpty() && freshCount > 0) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        int[] start = queue.poll();
        for (int[] dir : dirs) {
          int x = dir[0] + start[0];
          int y = dir[1] + start[1];

          if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == 1) {
            grid[x][y] = 2;
            queue.offer(new int[] {x, y});
            freshCount--;
          }
        }
      }
      minutes++;
    }
    return freshCount > 0 ? -1 : minutes;
  }
}
