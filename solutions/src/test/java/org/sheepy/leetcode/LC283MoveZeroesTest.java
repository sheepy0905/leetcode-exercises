package org.sheepy.leetcode;

import org.junit.jupiter.api.Test;

class LC283MoveZeroesTest {

  @Test
  void moveZeroes() {
    int[] nums = new int[]{0, 1, 0, 3, 12};
    LC283MoveZeroes solution = new LC283MoveZeroes();
    solution.moveZeroes(nums);
  }
}