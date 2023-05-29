package org.example.programmers.level0;

public class 대문자와_소문자 {
    public String solution(String my_string) {
        String answer = "";
        char[] splitString = my_string.toCharArray();
        
        for (char str : splitString) {
            answer += Character.isUpperCase(str) ? Character.toLowerCase(str) : Character.toUpperCase(str);
        }
        
        return answer;
    }
}
