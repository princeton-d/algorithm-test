package org.example;

public class _0_자릿수_더하기 {
    public int solution(int n) {
        String[] splitNumber = (n + "").split("");
        int answer = 0;
        
        for (String number : splitNumber) {
            answer += Integer.parseInt(number);
        }
        
        return answer;
    }
}
