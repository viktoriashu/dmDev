package com.viktoria.cs.lesson3.string;

/**
 * Задание 2
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * <p>
 * Написать 2 метода:
 * <p>
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * <p>
 * Посчитать сумму всех чисел из строки
 * <p>
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */


public class Task2 {

    public static final char ZERO = '0';
    public static final char ONE = '1';
    public static final char TWO = '2';
    public static final char THREE = '3';
    public static final char FOUR = '4';
    public static final char FIVE = '5';
    public static final char SIX = '6';
    public static final char SEVEN = '7';
    public static final char EIGHT = '8';
    public static final char NINE = '9';

    public static void main(String[] args) {
        String value = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        char[] charValueArray = value.toCharArray();
        int[] numbersArray = new int[sizeNumbersArray(charValueArray)];
        numbersArray = fillingNumbersArray(charValueArray, numbersArray);
        int sumValue = sumValue(numbersArray);
        print(sumValue, value);

    }

    //Метод по определению размера массива цифр (int [] numbersArray)
    private static int sizeNumbersArray(char[] charValueArray) {
        int count = 0;
        for (char c : charValueArray) {
            switch (c) {
                case ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE -> count++;
            }
        }
        return count;
    }

    //Метод по заполнению массива цифр (int [] numbersArray)
    private static int[] fillingNumbersArray(char[] charValueArray, int[] numbersArray) {
        int indexNumbersArray = 0;
        for (int i = 0; i < charValueArray.length; i++) {
            switch (charValueArray[i]) {
                case ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE -> {
                    numbersArray[indexNumbersArray] = Character.getNumericValue(charValueArray[i]);
                    indexNumbersArray++;
                }
            }
        }
        return numbersArray;
    }

    //Метод по определению суммы цифр (int sumValue) из массива цифр (int [] numbersArray)
    private static int sumValue(int[] numbersArray) {
        int currentValue = 0;
        for (int i : numbersArray) {
            currentValue += i;
        }
        return currentValue;
    }

    private static void print(int sumValue, String value) {
        System.out.println("Сумма всех числе в строке: " + "\"" + value + "\"" + " равна " + sumValue);
    }
}
