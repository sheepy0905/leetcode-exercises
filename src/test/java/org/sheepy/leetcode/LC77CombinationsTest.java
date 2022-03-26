package org.sheepy.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LC77CombinationsTest {

  private LC77Combinations solution;

  @BeforeEach
  void setUp() {
    solution = new LC77Combinations();
  }

  @Test
  void combine() {
    solution.combine(4, 2);
  }
}