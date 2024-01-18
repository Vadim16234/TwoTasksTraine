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
    public Map<Integer, Integer> doubl(int[] array) {
        int count;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            if (map.containsKey(num)) {
                count = map.get(num);
                map.put(num, count + 1);
            } else {
                map.put(num, 1);
            }
        }
        System.out.println(map);
        return map;
    }
}
