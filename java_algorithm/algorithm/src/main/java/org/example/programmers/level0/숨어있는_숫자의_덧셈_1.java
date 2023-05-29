package org.example.programmers.level0;

public class 숨어있는_숫자의_덧셈_1 {
    public int solution(String my_string) {
        int answer = 0;
        String[] stringArr = my_string.replaceAll("[^0-9]", "").split("");
        for (String number : stringArr) {
            answer += Integer.parseInt(number);
        }
        return answer;
    }
}
