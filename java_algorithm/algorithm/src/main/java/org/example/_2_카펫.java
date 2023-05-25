package org.example;

public class _2_카펫 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int tile = brown + yellow;

        for (int i = 2; i <= Math.sqrt(tile); i++) {
            if (tile % i == 0) {
                int x = i;
                int y = tile / i;

                if ((x - 2) * (y - 2) == yellow) {
                    answer = x >= y ? new int[]{x, y} : new int[]{y, x};
                    break;
                }
            }
        }
        return answer;
    }
}
