package com.viktoria.cs.lesson8.util;

import java.util.Random;

public final class UtilRandom {
    private static final Random RANDOM = new Random();


    public UtilRandom() {
    }

    public static int getNextWithoutZero(int bound) {
        return RANDOM.nextInt(bound) + 1;
    }

    public static int getNext(int bound) {
        return RANDOM.nextInt(bound);
    }

    public static int getRange(int boundStart, int boundEnd) {
        return RANDOM.nextInt(boundStart, boundEnd);
    }
}
