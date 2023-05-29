package org.example.programmers.level1;

public class 자릿수_더하기 {
    
    public class Solution {
        public int solution(int n) {
            int answer = 0;
            
            String[] splitInput = String.valueOf(n).split("");
            
            for (String number : splitInput) {
                answer+= Integer.parseInt(number);
            }
            
            return answer;
        }
    }
}
