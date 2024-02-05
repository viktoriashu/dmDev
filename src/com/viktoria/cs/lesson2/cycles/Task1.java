package com.viktoria.cs.lesson2.cycles;

/**
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число,
 * а возвращать количество четных цифр (вторая функция - нечетных).
 * <p>
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */

public class Task1 {
    public static void main(String[] args) {
        int value = -450265; // 4 четных (4, 0, 2, 6) и 2 нечетных (5, 5) (число 450265)

        System.out.println("Количество четных чисел составило: " + unevenNumbers(value));
        System.out.println("Количество нечетных чисел составило: " + evenNumbers(value));
    }

    private static int unevenNumbers(int value) {
        int count = 0;
        for (int i = 0; value != 0; i++) {
            int currentValue = value % 10;
            value = value / 10;
            if (isEven(currentValue) == true) {
                count = count + 1;
            }
        }
        return count;
    }


    private static int evenNumbers(int value) {
        int count = 0;
        for (int i = 0; value != 0; i++) {
            int currentValue = value % 10;
            value = value / 10;
            if (isEven(currentValue) == false) {
                count = count + 1;
            }
        }
        return count;
    }

    private static boolean isEven(int value) {
        return value % 2 == 0;
    }
}