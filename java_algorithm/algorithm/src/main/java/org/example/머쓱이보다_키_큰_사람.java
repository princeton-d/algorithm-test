package org.example;

import java.util.*;
import java.util.stream.*;

public class 머쓱이보다_키_큰_사람 {
    public int solution(int[] array, int height) {
        return Arrays.stream(array)
            .boxed()
            .filter(i -> i > height)
            .collect(Collectors.toList())
            .size();
    }
}
