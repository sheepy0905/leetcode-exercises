package org.sheepy.leetcode;

public class LC1007MinimumDominoRotations {
  public int minDominoRotations(int[] tops, int[] bottoms) {
    int t1 = countRotation(tops, bottoms, tops[0]);
    int t2 = countRotation(bottoms, tops, bottoms[0]);

    if (t1 * t2 > 0) {
      return Math.min(t1, t2);
    } else {
      return Math.max(t1, t2);
    }
  }

  public int countRotation(int[] arr1, int[] arr2, int target) {
    int count1 = 0, count2 = 0;
    for (int i = 0; i < arr1.length; i++) {
      if (target != arr1[i] && target != arr2[i]) {
        return -1;
      }
      if (target != arr1[i]) {
        count1++;
      }
      if (target != arr2[i]) {
        count2++;
      }
    }
    return Math.min(count1, count2);
  }
}
