package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 6, 4, 2, 74, 25, 21, 13};
        List<Integer> lists = Arrays.stream(arr).sorted().boxed().collect(Collectors.toList());
        LinkedList<Integer> list = new LinkedList<>(lists);
        System.out.println(list.getLast());
    }
}
