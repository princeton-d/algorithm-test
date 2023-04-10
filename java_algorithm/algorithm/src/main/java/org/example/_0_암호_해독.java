package org.example;

public class _0_암호_해독 {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] splitArr = cipher.split("");
        
        for (int i = code; i < splitArr.length + 1; i += code) {
            answer = answer + splitArr[i - 1];
        }
        
        return answer;
    }
}
