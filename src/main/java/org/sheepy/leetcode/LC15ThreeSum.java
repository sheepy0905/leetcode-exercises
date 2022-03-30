package org.sheepy.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC15ThreeSum {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> results = new ArrayList<>();
    if (nums == null || nums.length < 3) {
      return results;
    }
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 2; i++) {
      if (i == 0 || nums[i - 1] != nums[i]) {
        int left = i + 1, right = nums.length - 1;
        while (left < right) {
          int sum = nums[i] + nums[left] + nums[right];
          if (sum < 0) {
            left++;
          } else if (sum > 0) {
            right--;
          } else {
            results.add(Arrays.asList(nums[i], nums[left], nums[right]));
            do {
              left++;
            } while (nums[left] == nums[left - 1] && left < right);
          }
        }
      }
    }
    return results;
  }
}
