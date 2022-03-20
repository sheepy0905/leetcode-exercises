package org.sheepy.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC3LongestSubstringWithoutRepeatingChar {
  public int lengthOfLongestSubstring(String s) {
    if (s.length() < 2) {
      return s.length();
    }
    Map<Character, Integer> map = new HashMap<>();
    char[] str = s.toCharArray();
    int max = 0, left = 0, right = 1;
    while (right < str.length) {
      if (map.containsKey(str[right]) && map.get(str[right]) >= left) {
        left = map.get(str[right]) + 1;
      }
      map.put(str[right], right);
      if (max < right - left + 1) {
        max = right - left + 1;
      }
      right++;
    }
    return max;
  }
}
