package org.sheepy.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC77Combinations {
  public List<List<Integer>> combine(int n, int k) {
    List<List<Integer>> ret = new ArrayList<>();
    backtrack(ret, new ArrayList<>(), n, k, 1);
    return ret;
  }

  public void backtrack(List<List<Integer>> results, List<Integer> temp, int n, int k, int start) {
    if (temp.size() == k) {
      results.add(new ArrayList<>(temp));
      return;
    }
    for (int i = start; i <= n - (k - temp.size()) + 1; i++) {
      temp.add(i);
      backtrack(results, temp, n, k, i + 1);
      temp.remove(temp.size() - 1);
    }
  }
}
