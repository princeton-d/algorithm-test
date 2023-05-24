package org.example;

public class _2_JadenCase_문자열_만들기 {

    public String solution(String s) {
        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].toLowerCase();
            String[] input = arr[i].split("");
            if (input[0].matches("[0-9]")) {
                arr[i] = String.join("", input);
                continue;
            }
            input[0] = input[0].toUpperCase();
            arr[i] = String.join("", input);
        }

        if (s.lastIndexOf(" ") == s.length() - 1) {
            return String.join(" ", arr) + " ";
        }
        return String.join(" ", arr);
    }

}
