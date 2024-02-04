package com.viktoria.cs.lesson2.com.viktoria.cs.lesson2.arrays;

/**
 * Дан одномерный массив целых чисел.
 * <p>
 * Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами,
 * только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 * <p>
 * Пример:
 * <p>
 * [-4, -18]
 * <p>
 * [-4, 0, 1, 9, 0, -18, 3] -> [0, 0]
 * <p>
 * [1, 9, 3]
 */

public class Task3 {

    public static void main(String[] args) {
        int[] array1D = {-4, 0, 1, 9, 0, -18, 3};
        int[] arrayPositive = new int[arraySizePositive(array1D)];
        int[] arrayNegative = new int[arraySizeNegative(array1D)];
        int[] arrayZero = new int[arraySizeZero(array1D)];


        arrayPositive = fillingArrayPositive(array1D, arrayPositive);
        arrayNegative = fillingArrayNegative(array1D, arrayNegative);
        arrayZero = fillingArrayZero(array1D, arrayZero);

        int[][] array2D = fillingArray2D(arrayPositive, arrayNegative, arrayZero);


//        printArray(arrayPositive);
//        printArray(arrayNegative);
//        printArray(arrayZero);

        printArray2D(array2D);


//Этот вывод использовался для проверки создания пустого массива
//        System.out.println(array2D[1].length);
    }


    //определение размера одномерного массива положительных чисел
    private static int arraySizePositive(int[] values) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (0 < values[i]) {
                count++;
            }
        }
        return count;
    }

    //определение размера одномерного массива отрицательных чисел
    private static int arraySizeNegative(int[] values) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < 0) {
                count++;
            }
        }
        return count;
    }

    //определение размера одномерного массива чисел равных нулю
    private static int arraySizeZero(int[] values) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 0) {
                count++;
            }
        }
        return count;
    }


    //заполнение одномерного массива положительных чисел
    private static int[] fillingArrayPositive(int[] array1D, int[] values) {
        int[] valuesFilling = new int[values.length];
        int valuesFillingIndex = 0;
        for (int i = 0; i < array1D.length; i++) {
            if (0 < array1D[i]) {
                valuesFilling[valuesFillingIndex] = array1D[i];
                valuesFillingIndex++;
            }
        }
        return valuesFilling;
    }

    //заполнение одномерного массива отрицательных чисел
    private static int[] fillingArrayNegative(int[] array1D, int[] values) {
        int[] valuesFilling = new int[values.length];
        int valuesFillingIndex = 0;
        for (int i = 0; i < array1D.length; i++) {
            if (array1D[i] < 0) {
                valuesFilling[valuesFillingIndex] = array1D[i];
                valuesFillingIndex++;
            }
        }
        return valuesFilling;
    }

    //заполнение одномерного массива числами равными нулю
    private static int[] fillingArrayZero(int[] array1D, int[] values) {
        int[] valuesFilling = new int[values.length];
        int valuesFillingIndex = 0;
        for (int i = 0; i < array1D.length; i++) {
            if (array1D[i] == 0) {
                valuesFilling[valuesFillingIndex] = array1D[i];
                valuesFillingIndex++;
            }
        }
        return valuesFilling;
    }


    //Вывод кажого элемента одномерного массива
//    private static void printArray(int[] values) {
//        for (int i : values) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//    }

    //заполнение двумерного массива
    private static int[][] fillingArray2D(int[] arrayPositive, int[] arrayNegative, int[] arrayZero) {
        int[][] fillingArray2D = new int[3][];

        for (int i = 0; i < fillingArray2D.length; i++) {
            if (i == 0) {
                fillingArray2D[i] = new int[arrayPositive.length];
                for (int j = 0; j < fillingArray2D[i].length; j++) {
                    fillingArray2D[i][j] = arrayPositive[j];
                }
            } else if (i == 1) {
                fillingArray2D[i] = new int[arrayNegative.length];
                for (int j = 0; j < fillingArray2D[i].length; j++) {
                    fillingArray2D[i][j] = arrayNegative[j];
                }
            } else if (i == 2) {
                fillingArray2D[i] = new int[arrayZero.length];
                for (int j = 0; j < fillingArray2D[i].length; j++) {
                    fillingArray2D[i][j] = arrayZero[j];
                }
            }
        }
        return fillingArray2D;
    }

    //Вывод кажого элемента двумерного массива
    private static void printArray2D(int[][] values) {
        for (int i = 0; i < values.length; i++) {
            int[] array1;
            array1 = values[i];
            for (int j = 0; j < array1.length; j++) {
                System.out.print(array1[j] + " ");
            }
            System.out.println();
        }
    }
}
