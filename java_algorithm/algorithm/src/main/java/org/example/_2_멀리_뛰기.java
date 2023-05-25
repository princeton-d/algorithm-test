package org.example;

public class _2_멀리_뛰기 {
    public static long[] dp = new long[2001];

    public long solution(int n) {
        dp[1] = 1;
        dp[2] = 2;

        return dfs(n);
    }

    public long dfs(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = (dfs(n - 1) + dfs(n - 2)) % 1234567;

        return dp[n];
    }
}
