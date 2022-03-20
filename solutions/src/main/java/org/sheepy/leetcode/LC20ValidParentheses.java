package org.sheepy.leetcode;

import java.util.Stack;

public class LC20ValidParentheses {

  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      switch (c) {
        case '(':
        case '[':
        case '{':
          stack.push(c);
          break;
        case ')':
        case ']':
        case '}':
          Character ch = stack.pop();
          if ((c == ')' && ch != '(')
                       || (c == ']' && ch != '[')
                        || (c == '}' && ch != '{')) {
          return false;
        }
        break;
        default:
          break;
      }
    }
    return stack.isEmpty();
  }
}
