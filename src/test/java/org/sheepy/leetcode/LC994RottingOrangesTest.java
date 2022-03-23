package org.sheepy.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LC994RottingOrangesTest {

  private LC994RottingOranges solution;

  @BeforeEach
  void setUp() {
    solution = new LC994RottingOranges();
  }

  @Test
  void orangesRotting() {
    int[][] grid = {
        {2, 1, 1},
        {1, 1, 0},
        {0, 1, 1}
    };
    int ret = solution.orangesRotting(grid);
    Assertions.assertEquals(4, ret);
  }
}