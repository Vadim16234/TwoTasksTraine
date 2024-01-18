package org.example;

import java.util.ArrayList;
import java.util.List;

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
    public List<String> search() {
        boolean check;
        int[] array = {7, 6, 3, 16, 8, 15, 17, 18};
        int number = 23;

        List<String> list = new ArrayList<>();

        do {
            check = false;
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if ((array[i] + array[j]) == number) {
                        list.add("[" + i + ", " + j + "]");
                        check = true;
                    }
                }
            }
        } while (!check);

        System.out.println(list);
        return list;
    }

}
