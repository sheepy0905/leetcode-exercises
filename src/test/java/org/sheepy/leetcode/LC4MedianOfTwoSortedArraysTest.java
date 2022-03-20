package org.sheepy.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LC4MedianOfTwoSortedArraysTest {

  private LC4MedianOfTwoSortedArrays solution;
  private int[] array1;
  private int[] array2;

  @BeforeEach
  void setUp() {
    solution = new LC4MedianOfTwoSortedArrays();
  }

  @Test
  void findMedianSortedArrays() {
    array1 = new int[] {};
    array2 = new int[] {0};
    double median = solution.findMedianSortedArrays(array1, array2);
  }
}