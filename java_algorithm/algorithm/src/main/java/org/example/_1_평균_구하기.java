package org.example;

public class _1_평균_구하기 {
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
