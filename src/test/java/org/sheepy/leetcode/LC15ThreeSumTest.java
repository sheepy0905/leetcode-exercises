package org.sheepy.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LC15ThreeSumTest {

  private LC15ThreeSum solution;

  @BeforeEach
  void setUp() {
    solution = new LC15ThreeSum();
  }

  @Test
  void threeSum_test1() {
    int[] inputs = {-1, 0, 1, 2, -1, -4};
    solution.threeSum(inputs);
  }

  @Test
  void threeSum_test2() {
    int[] inputs = {1, -1, -1, 0};
    solution.threeSum(inputs);
  }
}