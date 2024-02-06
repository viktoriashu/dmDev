package com.viktoria.cs.lesson2.cycles;

/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 * <p>
 * Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 */
public class Task2 {
    public static void main(String[] args) {
        int value = 7654321;
        System.out.println(reverse(value));
    }

    private static int reverse(int value) {
        int reversNum = 0;
        for (int currentValue = value; currentValue != 0; currentValue /= 10) {
            reversNum = reversNum * 10 + currentValue % 10;
        }
        return reversNum;
    }

}
