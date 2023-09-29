package org.example.baekjoon.silver;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 그룹_단어_체커 {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/main/java/org/example/baekjoon/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int inputLength = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < inputLength; i++) {
            String[] input = br.readLine().split("");
            List<String> checkInput = new ArrayList<>();
            checkInput.add(input[0]);

            for (String str : input) {
                if (str.equals(checkInput.get(checkInput.size() - 1))) {
                    continue;
                }

                checkInput.add(str);
            }

            Set<String> set = new HashSet<>(checkInput);

            if (checkInput.size() == set.size()) {
                result++;
            }

        }

        sb.append(result);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}
