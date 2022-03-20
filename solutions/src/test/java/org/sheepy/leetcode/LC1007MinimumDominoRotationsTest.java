package org.sheepy.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LC1007MinimumDominoRotationsTest {

  private LC1007MinimumDominoRotations solution;

  @BeforeEach
  void setUp() {
    solution = new LC1007MinimumDominoRotations();
  }

  @Test
  void minDominoRotations() {
    int[] tops = new int[] {2, 1, 2, 1, 1, 1};
    int[] bottoms = new int[] {1, 2, 2, 2, 2, 2};
    int ret = solution.minDominoRotations(tops, bottoms);
  }
}