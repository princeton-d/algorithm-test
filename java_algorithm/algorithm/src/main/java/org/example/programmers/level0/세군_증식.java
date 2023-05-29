package org.example.programmers.level0;

public class 세군_증식 {
    public int solution(int n, int t) {
        int answer = n;
        
        for (int i = 0; i < t; i++) {
            answer = answer * 2;
        }
        
        return answer;
    }
}
