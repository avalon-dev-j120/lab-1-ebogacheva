package ru.avalon.java.j20.labs;

import org.junit.Assert;
import org.junit.Test;
import ru.avalon.java.j20.labs.models.Numbers;


public class TaskTest {

    @Test
    public void avgTestGeneral() {

        Double[] array = {10.0, 20.0, 30.0};
        double expectedResult = 20.0;
        double actualResult = Numbers.avg(array);

        Assert.assertEquals(expectedResult, actualResult, 0.0000000000000001);
    }

    @Test
    public void avgTestZeros() {

        Double[] array = {0.0, 0.0, 0.0};
        double expectedResult = 0.0;
        double actualResult = Numbers.avg(array);

        Assert.assertEquals(expectedResult, actualResult, 0.0000000000000001);
    }

    @Test
    public void avgTestEmptyArray() {

        Double[] array = {};
        double expectedResult = 0.0;
        double actualResult = Numbers.avg(array);

        Assert.assertEquals(expectedResult, actualResult, 0.0000000000000001);
    }

    @Test
    public void avgTestNegativeArray() {

        Double[] array = {-10.0, 10.0};
        double expectedResult = 0.0;
        double actualResult = Numbers.avg(array);

        Assert.assertEquals(expectedResult, actualResult, 0.0000000000000001);
    }

    @Test
    public void avgTestMaxIntValue() {

        Integer[] array = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        double expectedResult = Integer.MAX_VALUE;
        double actualResult = Numbers.avg(array);

        Assert.assertEquals(expectedResult, actualResult, 0.0000000000000001);
    }

}
