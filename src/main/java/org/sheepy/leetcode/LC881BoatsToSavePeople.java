package org.sheepy.leetcode;

import java.util.Arrays;

public class LC881BoatsToSavePeople {
  public int numRescueBoats(int[] people, int limit) {
    if (people.length == 1) {
      return 1;
    }
    Arrays.sort(people);
    int left = 0, right = people.length - 1;
    int i = 0;
    while (left <= right) {
      if (people[left] + people[right] <= limit) {
        left++;
      }
      right--;
      i++;
    }
    return i;
  }
}
