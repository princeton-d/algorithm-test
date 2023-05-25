package org.example;

public class _2_피보나치_수 {
    public static int[] dp = new int[100001];

    public int solution(int n) {
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        return fibonacci(n);
    }

    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = (fibonacci(n - 1) % 1234567 + fibonacci(n - 2)) % 1234567;

        return dp[n];
    }
}
