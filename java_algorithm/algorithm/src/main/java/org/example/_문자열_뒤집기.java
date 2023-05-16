package org.example;

public class _문자열_뒤집기 {
    public static void main(String[] args) {
        System.out.println(solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
    }

    static int solution(String str1, String str2) {
        // return str1.contains(str2) ? 1 : 2;

        String[] arr = str1.split(str2);
        // str1 이 있는 경우 -> ["ab", "E443fgh22iJKlmn1o"]
        // str1 이 없는 경우 -> ["AbcAbcA"]
        boolean result = arr[0].equals(str1);
        if (result) {
            return 2;
        }
        return 1;
    }
}
