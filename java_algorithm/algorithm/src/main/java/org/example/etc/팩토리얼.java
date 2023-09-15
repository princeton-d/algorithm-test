package org.example.etc;

public class 팩토리얼 {

    public static int solution(int number) {
        return f(number, 1);
    }

    public static int f(int number, int result) {
        if (number == 1) {
            return number;
        }

        result = f(number - 1, result) * number;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(30));
    }

}
