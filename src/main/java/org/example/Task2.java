package org.example;

import java.util.HashMap;
import java.util.Map;

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
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            map.put(array[i], i);
        }

        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i]) && map.get(array[i]) != i) {
                return true;
            }
        }
        return false;
    }
}
