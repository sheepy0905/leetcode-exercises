package org.sheepy.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LC3LongestSubstringWithoutRepeatingCharTest {

  private LC3LongestSubstringWithoutRepeatingChar solution;

  @BeforeEach
  void setUp() {
    solution = new LC3LongestSubstringWithoutRepeatingChar();
  }

  @Test
  public void test() {
    int l = solution.lengthOfLongestSubstring("dvdf");
  }
}