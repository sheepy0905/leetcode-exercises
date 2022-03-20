package org.sheepy.leetcode;

public class LC4MedianOfTwoSortedArrays {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int[] shortArr, longArr;
    if (nums1.length < nums2.length) {
      shortArr = nums1;
      longArr = nums2;
    } else {
      shortArr = nums2;
      longArr = nums1;
    }
    int total = nums1.length + nums2.length;
    int half = total / 2;
    boolean twoMedians = total % 2 == 0;

    int left = 0, right = shortArr.length - 1;
    int aLeft, aRight, bLeft, bRight;
    while (true) {
      int i = (int) Math.floor((double) (left + right) / 2d);
      int j = half - i - 2;

      aLeft = i >= 0 ? shortArr[i] : Integer.MIN_VALUE;
      aRight = i + 1 < shortArr.length ? shortArr[i + 1] : Integer.MAX_VALUE;
      bLeft = j >= 0 ? longArr[j] : Integer.MIN_VALUE;
      bRight = j + 1 < longArr.length ? longArr[j + 1] : Integer.MAX_VALUE;

      if (aLeft <= bRight && bLeft <= aRight) {
        return twoMedians ? (double) (Math.max(aLeft, bLeft) + Math.min(aRight, bRight)) / 2 : Math.min(aRight, bRight);
      } else if (aLeft > bRight) {
        right = i - 1;
      } else {
        left = i + 1;
      }
    }
  }

}
