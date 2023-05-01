package org.example;

public class 백준_2439_별찍기 {

    public static void main(String[] args) {
        int input = 5;

        for (int i = 1; i <= input; i++) {
            System.out.println(" ".repeat(input - i) + "*".repeat(i));
        }
    }
}
