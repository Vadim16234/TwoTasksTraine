package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        Task1 task1 = new Task1();
        System.out.println(Arrays.toString(task1.search()));

        System.out.println();

        System.out.println("Задача 2");
        Task2 task2 = new Task2();
        int[] array = {4, 5, 6, 6, 8};
        System.out.print("Result: " + task2.doubl(array));
    }
}