package org.example;

public class _2_다음_큰_숫자 {
    public int solution(int n) {
        String changeN = Integer.toBinaryString(n);
        int countN = 0;
        for (int i = 0; i < changeN.length(); i++) {
            if (changeN.charAt(i) == '1') {
                countN++;
            }
        }

        for (int i = n + 1; i <= 1000000; i++) {
            int count = 0;
            String change = Integer.toBinaryString(i);

            for (int j = 0; j < change.length(); j++) {
                if (change.charAt(j) == '1') {
                    count++;
                }
            }

            if (countN == count) {
                return i;
            }
        }

        return 0;
    }
}
