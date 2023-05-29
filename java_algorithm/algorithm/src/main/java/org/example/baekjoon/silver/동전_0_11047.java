package org.example.baekjoon.silver;

import java.io.*;
import java.util.*;

public class 동전_0_11047 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 동전의 종류
        int K = Integer.parseInt(st.nextToken()); // 만들어야 하는 금액
        int result = 0; // 제출할 총 동전의 갯수
        int[] coins = new int[N]; // 동전을 종류별로 담아둘 배열

        for (int i = N - 1; i >= 0; i--) { // 내림차순으로 동전을 정렬하기 위해 i가 1씩 줄어드는 방식으로 반복문 실행
            coins[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < coins.length; i++) {
            if (K == 0) {
                break; // 종료조건 -> K가 0이 되는 것은 더이상 K만큼 동전을 사용했다는 뜻이다.
            }

            if (coins[i] > K) { // 해당 동전이 구해야하는 금액(계산하고 남은 금액 포함)보다 많다면 다음 반복문으로
                continue;
            }

            result += K / coins[i];
            K -= K / coins[i] * coins[i]; // K / coins[i] -> 동전이 몇개 필요한지 계산
        }

        System.out.println(result);
    }
}
