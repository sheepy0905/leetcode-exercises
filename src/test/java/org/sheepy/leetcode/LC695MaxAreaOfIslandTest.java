package org.sheepy.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LC695MaxAreaOfIslandTest {

  private LC695MaxAreaOfIsland solution;

  @BeforeEach
  void setUp() {
    solution = new LC695MaxAreaOfIsland();
  }

  @Test
  void maxAreaOfIsland() {
    int[][] grid = {{1, 1, 0, 0, 0},
        {1, 1, 0, 0, 0},
        {0, 0, 0, 1, 1},
        {0, 0, 0, 1, 1}};

    int area = solution.maxAreaOfIsland(grid);
    Assertions.assertEquals(4, area);
  }
}