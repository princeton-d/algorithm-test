package org.example.programmers.level0;

public class 개미_군단 {
    public int solution(int hp) {
        int count = 0;
        while (hp != 0) {
            
            if (hp >= 5) {
                count++;
                hp -= 5;
            }
            
            else if (hp >= 3) {
                count++;
                hp -= 3;
            }
            
            else if (hp >= 1) {
                count++;
                hp--;
            }
        }
        
        return count;
    }
}
