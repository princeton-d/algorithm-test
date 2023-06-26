package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        int n = 45;

        while (true) {
            System.out.println(n % 3);
            System.out.println(n / 3);

            if (n == 1 || n == 0) {
                break;
            }
        }
    }
}
