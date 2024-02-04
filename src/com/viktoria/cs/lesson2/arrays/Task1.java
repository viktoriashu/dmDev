package com.viktoria.cs.lesson2.arrays;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только
 * положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 * <p>
 * Не забывать, что всю логику приложения нужно выносить в отдельные функции. main - только для тестирования
 * написанного функционала.
 */

public class Task1 {
    public static void main(String[] args) {
        int[] values = {3, 5, -6, 3, 2, -9, 0, -123};
        int[] valuesNotNegative = new int[arraySize(values)];

        fillArray(values, valuesNotNegative);
        multiplicationArray(valuesNotNegative);
        printArray(valuesNotNegative);
    }

    //определение размера нового массива
    private static int arraySize(int[] values) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] >= 0) {
                count++;
            }
        }
        return count;
    }

    //заполнение нового массива
    private static int[] fillArray(int[] values, int[] valuesNotNegative) {
        int valuesNotNegativeIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (0 < values[i]) {
                valuesNotNegative[valuesNotNegativeIndex] = values[i];
                valuesNotNegativeIndex++;
            }
        }
        return valuesNotNegative;
    }

    //Умножение каждого элемента на длину массива
    private static int[] multiplicationArray(int[] valuesNotNegative) {
        for (int i = 0; i < valuesNotNegative.length; i++) {
            valuesNotNegative[i] *= valuesNotNegative.length;
        }
        return valuesNotNegative;
    }

    //Вывод кажого элемента нового массива
    private static void printArray(int[] valuesNotNegative) {
        for (int i : valuesNotNegative) {
            System.out.print(i + " ");
        }
    }
}