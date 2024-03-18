package com.teachmeskills.lesson_18.hw.task_2.launcher;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Andrew");
        list.add("Artem");
        list.add("Alina");
        list.add("Anastasia");
        list.add("Artem");
        list.add("Nikita");
        list.add("Oleg");
        list.add("Ivan");
        list.add("Cyril");
        list.add("Ruslan");
        list.add("Eugene");
        list.add("Paul");
        list.add("Ruslan");
        list.add("Ruslan");
        list.add("alexander");
        list.add("Daniel");
        list.add("alexei");
        list.add("Vladislav");

        System.out.println("\"A\" names => " + list.stream()
                .filter(n -> n.toLowerCase().startsWith("a")).toList());

        System.out.print("First name => ");
        list.stream()
                .sorted()
                .limit(1)
                .forEach(System.out::println);
    }
}
