package com.viktoria.cs.lesson2.arrays;

/**
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти
 * компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43] (649/8 = 81)
 * <p>
 * Далее определить среднее арифметическое всех элементов целочисленного массива и вывести на консоль только те
 * элементы, которые больше этого среднего арифметического.
 */
public class Task2 {
    public static void main(String[] args) {
        char[] arrayChar = {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};
        int[] arrayInt = arrayInt(arrayChar);

        int arithmeticMean = arithmeticMean(arrayInt);
        printArray(arrayInt, arithmeticMean);
    }

    //Преобразовние в одномерный массив чисел
    private static int[] arrayInt(char[] arrayChar) {
        int[] arrayInt = new int[arrayChar.length];
        int arrayIntIndex = 0;
        for (char symbol : arrayChar) {
            arrayInt[arrayIntIndex] = symbol;
            arrayIntIndex++;

        }
        return arrayInt;
    }

    //Определение среднего арифметического
    private static int arithmeticMean(int[] arrayInt) {
        int arithmeticMean = 0;
        for (int value : arrayInt) {
            arithmeticMean = arithmeticMean + value;

        }
        return arithmeticMean / arrayInt.length;
    }

    //Вывод кажого элемента нового массива
    private static void printArray(int[] arrayInt, int arithmeticMean) {

        for (int value : arrayInt) {
            if(value > arithmeticMean){
                System.out.print(value + " ");
            }

        }
    }
}