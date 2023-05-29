package org.example.programmers.level0;

public class 인덱스_바꾸기 {
    public String solution(String my_string, int num1, int num2) {
        String[] answer = my_string.split("");
        String a = answer[num1];
        String b = answer[num2];
        
        answer[num1] = b;
        answer[num2] = a;
        
        return String.join("", answer);
    }
}
