package org.sheepy.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LC895MaximumFrequencyStackTest {

  private LC895MaximumFrequencyStack solution;

  @BeforeEach
  void setUp() {
    solution = new LC895MaximumFrequencyStack();
    solution.push(5);
    solution.push(1);
    solution.push(2);
    solution.push(5);
    solution.push(5);
    solution.push(5);
    solution.push(1);
    solution.push(6);
    solution.push(1);
    solution.push(5);
  }

  @Test
  public void test() {
    Assertions.assertEquals(5, solution.pop());
    Assertions.assertEquals(5, solution.pop());
    Assertions.assertEquals(1, solution.pop());
    Assertions.assertEquals(5, solution.pop());
    Assertions.assertEquals(1, solution.pop());
    Assertions.assertEquals(5, solution.pop());
    Assertions.assertEquals(6, solution.pop());
    Assertions.assertEquals(2, solution.pop());
    Assertions.assertEquals(1, solution.pop());
    Assertions.assertEquals(5, solution.pop());
  }
}