package org.sheepy.leetcode;

public class LC733FloodFill {
  public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    if (image[sr][sc] == newColor) {
      return image;
    }
    int currentColor = image[sr][sc];
    image[sr][sc] = newColor;
    if (sr > 0 && currentColor == image[sr - 1][sc]) {
      image = floodFill(image, sr - 1, sc, newColor);
    }
    if (sr < image.length - 1 && currentColor == image[sr + 1][sc]) {
      image = floodFill(image, sr + 1, sc, newColor);
    }
    if (sc > 0 && currentColor == image[sr][sc - 1]) {
      image = floodFill(image, sr, sc - 1, newColor);
    }
    if (sc < image[0].length - 1 && currentColor == image[sr][sc + 1]) {
      image = floodFill(image, sr, sc + 1, newColor);
    }
    return image;
  }
}
