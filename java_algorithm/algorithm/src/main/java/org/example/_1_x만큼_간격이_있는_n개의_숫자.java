package org.example;

public class _1_x만큼_간격이_있는_n개의_숫자 {
    
    class Solution {
        public long[] solution(int x, int n) {
            long[] answer = new long[n];
            long count = 0;
            
            for (int i = 0; i < n; i++) {
                count += x;
                answer[i] = count;
            }
            
            return answer;
        }
    }
}
