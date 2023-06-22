package org.example.programmers.level1;

public class 최소직사각형 {

    class Solution {
        public int solution(int[][] sizes) {
            int maxWidth = 0;
            int maxHeight = 0;

            for (int[] arr : sizes) {
                int maxNumber = Math.max(arr[0], arr[1]);
                int minNumber = Math.min(arr[0], arr[1]);

                if (maxNumber > maxWidth) {
                    maxWidth = maxNumber;
                }

                if (minNumber > maxHeight) {
                    maxHeight = minNumber;
                }
            }

            return maxWidth * maxHeight;
        }
    }

}
