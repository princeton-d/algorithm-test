package org.example.programmers.level0;

public class 문자열_뒤집기 {
    public String solution(String my_string) {
        StringBuffer sb = new StringBuffer(my_string);
        String answer = sb.reverse().toString();
        return answer;
    }
}
