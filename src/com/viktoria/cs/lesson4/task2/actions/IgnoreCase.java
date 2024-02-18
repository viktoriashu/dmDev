package com.viktoria.cs.lesson4.task2.actions;

import java.util.Locale;

public interface IgnoreCase {
    default String ignoreCase(String name) {
        String formatString = name.toUpperCase(Locale.ROOT);
        return formatString;
    }
}
