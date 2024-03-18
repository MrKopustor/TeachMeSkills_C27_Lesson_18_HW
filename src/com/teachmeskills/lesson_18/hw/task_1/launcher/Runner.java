package com.teachmeskills.lesson_18.hw.task_1.launcher;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        int size = 20;
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * 20) + 1);
        }
        System.out.println("Test indicator => " + list);

        System.out.println("stream count => " + list.stream()
                .count());

        System.out.println("Arithmetic mean of all numbers in the stream => " + list.stream()
                .distinct()
                .filter(n -> n >= 7 && n <= 17 && n % 2 == 0)
                .map(n -> n * 2)
                .sorted()
                .limit(4)
                .collect(Collectors.averagingInt(Integer::intValue)));
    }
}
