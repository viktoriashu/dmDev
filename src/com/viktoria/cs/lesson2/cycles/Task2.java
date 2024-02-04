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

    //оно некрасивое, но работает
    private static int reverse(int value) {
        double tensMultiplication = 1;
        double tensDivision = 0.1;
        int currentValue = 0;
        double sumValue = 0;
        for (int i = 0; value != 0; i++) {
            currentValue = value % 10;
            value = value / 10;
            sumValue = sumValue + currentValue * tensMultiplication;
            tensMultiplication = tensMultiplication / 10;
            tensDivision = tensDivision * 10;
        }
        return (int) (sumValue * tensDivision);
    }
}
