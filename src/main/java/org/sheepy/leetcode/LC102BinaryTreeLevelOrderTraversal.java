package org.sheepy.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LC102BinaryTreeLevelOrderTraversal {
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> results = new ArrayList<>();
    traverse(results, root, 0);
    return results;
  }

  public void traverse(List<List<Integer>> values, TreeNode node, int level) {
    if (node == null) {
      return;
    }
    if (level >= values.size()) {
      values.add(new LinkedList<>());
    }
    values.get(level).add(node.val);
    traverse(values, node.left, level + 1);
    traverse(values, node.right, level + 1);
  }

  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }
}
