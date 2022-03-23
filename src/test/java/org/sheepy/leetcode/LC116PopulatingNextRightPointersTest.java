package org.sheepy.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sheepy.leetcode.LC116PopulatingNextRightPointers.Node;

class LC116PopulatingNextRightPointersTest {

  private LC116PopulatingNextRightPointers solution;

  @BeforeEach
  void setUp() {
    solution = new LC116PopulatingNextRightPointers();
  }

  @Test
  void connect() {
    Node root = new Node(1);
    root.left = new Node(2, new Node(4), new Node(5), null);
    root.right = new Node(3, new Node(6), new Node(7), null);

    solution.connect(root);
  }
}