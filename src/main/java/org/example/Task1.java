package org.example;

import java.util.HashMap;
import java.util.Map;

/*
    Дан массив целых чисел. Необходимо реализовать метод, который возвращает индексы массива,
    значения которых в сумме дают число, переданное в массив

    Предполагается, что массив содержит только уникальные числа и всегда имеет искомые числа.
    Один и тот же элемент не может быть использован дважды.

    array = [3, 8, 15, 17], Number = 23
    result = [1, 2]

    Т.е. индексы 1 и 2 (значение 8 и 15) в сумме дают искомое число 23
 */
public class Task1 {
    public int[] search() {
        int[] array = {3, 8, 15, 17};
        int number = 23;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            map.put(array[i], i);
            int dif = number - array[i];
            if (map.containsKey(dif) && map.get(dif) != i) {
                return new int[]{i, map.get(dif)};
            }
        }
        return null;
    }
}
