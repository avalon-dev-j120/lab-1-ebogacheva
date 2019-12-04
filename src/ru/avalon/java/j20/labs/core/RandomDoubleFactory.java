package ru.avalon.java.j20.labs.core;

import java.util.Random;

public class RandomDoubleFactory implements Factory<Double[], Integer> {

    private final Random random = new Random();

    @Override
    public Double[] getInstance(Integer length) {
        Double[] array = new Double[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextDouble();
        }
        return array;
    }

}
