package org.example;

public class _0_특정_문자_제거하기 {
    public String solution(String my_string, String letter) {
        String[] stringArray = my_string.split(letter);
        
        return String.join("", stringArray);
    }
}
