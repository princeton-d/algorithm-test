package org.example;

public class _2_숫자의_표현 {
    public int solution(int n) {
        int[] arr = new int[n];
        int count = 1;
        int leftPointer = 0;
        int rightPointer = 0;
        int sum = 1;

        if (n == 1) {
            return 1;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        while (rightPointer != n - 1) {
            if (sum < n) {
                rightPointer++;
                sum += arr[rightPointer];
                continue;
            }

            if (sum > n) {
                sum -= arr[leftPointer];
                leftPointer++;
                continue;
            }

            if (sum == n) {
                rightPointer++;
                sum += arr[rightPointer];
                count++;
            }
        }

        return count;
    }
}
