package org.sheepy.leetcode;

public class LC283MoveZeroes {
  public void moveZeroes(int[] nums) {
    if (nums.length <= 1) {
      return;
    }
    int p = 0, q = 1;
    while (p < nums.length) {
      if (nums[p] == 0) {
        q = p + 1;
        while (q < nums.length) {
          if (nums[q] != 0) {
            swap(nums, p, q);
            break;
          }
          q++;
        }
      }
      p++;
    }
  }

  public void swap(int[] nums, int ix1, int ix2) {
    int temp = nums[ix1];
    nums[ix1] = nums[ix2];
    nums[ix2] = temp;
  }
}
