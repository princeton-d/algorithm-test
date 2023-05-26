package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        System.out.println(dfs(40));
    }

    public static int dfs(int number) {
        if (number <= 2) {
            return 1;
        }

        return dfs(number - 1) + dfs(number - 2);
    }

}
