package org.example;

public class _2_점프와_순간_이동 {
    public int solution(int n) {
        int result = 0;

        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;
            }
            else {
                n--;
                result++;
            }
        }
        return result;
    }
}
