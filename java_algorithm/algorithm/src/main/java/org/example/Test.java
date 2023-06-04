package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.stream().mapToInt(Integer::intValue).toArray();
    }
}
