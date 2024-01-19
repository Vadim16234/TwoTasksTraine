package org.example;

import java.util.*;

/*
    Дан массив целых чисел.
    Необходимо реализовать метод, который определяет, содержит ли данный массив дубликаты

    Пример:
    Array: [4,5,6,6,8]
    Result: true
    Число 6 повторяется 2 раза

    Array: [4,5,6,7,8]
    Result: false
    Дубликатов нет
 */
public class Task2 {
    public boolean doubl(int[] array) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            if (set.contains(array[i])) {
                return true;
            } else {
                set.add(array[i]);
            }
        }
        return false;
    }
}
