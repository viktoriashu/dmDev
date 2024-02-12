package com.viktoria.cs.lesson3.string;

import java.util.Locale;

/**
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * <p>
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */
public class Task1 {
    public static void main(String[] args) {
        String valueStart = "abc CpdCdd Dio OsfWwz";

        String value = valueStart;
        value = editString(value);
        value = removeDuplicates(value);
        print(valueStart, value);
    }

    //метод удаляет пробелы из строки и приводит ее к верхнему регистру
    private static String editString(String value) {
        value = value.replace(" ", "");
        value = value.toUpperCase(Locale.ROOT);
        return value;
    }

    //метод заменяет дубли на пробелы и выводит результат в отредактированном виде (без пробелов и в верхнем регистре)
    private static String removeDuplicates(String value) {
        char[] valueArray = value.toCharArray();
        int j = 1;
        for (int i = 0; i < valueArray.length-1; i++) {
                if (valueArray[i] == valueArray[j]) {
                    valueArray[i] = ' ';
                }
            j++;
        }
        value = new String(valueArray);
        return editString(value);
    }

    private static void print(String valueStart, String value) {
        System.out.println("Строка: " + "\"" + valueStart + "\"" +
                " после преобразований будет иметь вид: " + "\"" + value + "\"");
    }
}
