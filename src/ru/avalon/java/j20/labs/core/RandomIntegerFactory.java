package ru.avalon.java.j20.labs.core;

import java.util.Random;

public class RandomIntegerFactory implements Factory<Integer[], Integer>{


    private final Random random = new Random();

    @Override
    public Integer[] getInstance(Integer length) {
        Integer[] array = new Integer[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(101);
        }
        return array;
    }
}
