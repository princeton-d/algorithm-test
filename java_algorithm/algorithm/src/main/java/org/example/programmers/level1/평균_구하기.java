package org.example.programmers.level1;

public class 평균_구하기 {
    class Solution {
        public double solution(int[] arr) {
            int answer = 0;
            for (int i = 0; i < arr.length; i++) {
                answer += arr[i];
            }
            return (double) answer / arr.length;
        }
    }
}
