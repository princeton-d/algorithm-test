package org.example.etc;

public class 이진수_재귀 {

    public static String solution(int number) {

        return dfs(number, "");
    }

    private static String dfs(int number, String result) {
        if (number == 0) {
            return result;
        }

        result = dfs(number / 2, result) + String.valueOf(number % 2);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(11));
    }

}
