package org.example;

public class _0_문자열_안에_문자열 {
    public int solution(String str1, String str2) {
        boolean answer = str1.contains(str2);
        return answer ? 1 : 2;
    }
}
