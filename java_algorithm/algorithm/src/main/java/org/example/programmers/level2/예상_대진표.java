package org.example.programmers.level2;

public class 예상_대진표 {
    public int solution(int n, int a, int b) {
        int round = 1;

        while (true) {
            if (a - b == -1 && b % 2 == 0) {
                break;
            }

            if (b - a == -1 && a % 2 == 0) {
                break;
            }

            a = a % 2 == 0 ? a / 2 : (a + 1) / 2;
            b = b % 2 == 0 ? b / 2 : (b + 1) / 2;
            round++;
        }

        return round;
    }
}
