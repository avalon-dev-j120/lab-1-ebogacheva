package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;
import ru.avalon.java.j20.labs.core.RandomDoubleFactory;
import ru.avalon.java.j20.labs.core.RandomIntegerFactory;
import ru.avalon.java.j20.labs.models.Numbers;

/**
 * Задание №1.
 *
 * <p>Тема: "Создание обобщённых методов".
 *
 * <p>В рамках задания требуется описать и выполнить
 * несколько методов, обобщённых с указанной точностью.
 */
public class Task1 implements Task {

    /**
     * Фабрика, создающая массивы случайных чисел.
     */
//  private final RandomArrayFactory arrayFactory = new RandomArrayFactory();
    private final RandomIntegerFactory integerFactory = new RandomIntegerFactory();
    private final RandomDoubleFactory doubleFactory = new RandomDoubleFactory();


    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
//        int[] array = arrayFactory.getInstance(20);
//        int min = Numbers.min(array);
//        int max = Numbers.max(array);
//        double avg = Numbers.avg(array);
        /*
         * TODO(Студент): Выполните задание №1
         *
         * 1. Обобщить метод поиск среднего арифметического
         *
         *    Выполните обобщение метода с использованием шаблона так,
         *    чтобы метод мог выполнять поиск среднего арифметического
         *    в массивах любых чисел: целых и вещественных.
         *
         *    Возвращать необходимо значение типа double.
         *
         * 2. Обобщить метод поиск максимального значения
         *
         *    Выполните обобщение метода с использованием шаблона так,
         *    чтобы метод мог выполнять поиск максимального значения
         *    в массивах любых чисел: целых и вещественных.
         *
         * 3. Обобщить метод поиск минимального значения
         *
         *    Выполните обобщение метода с использованием шаблона так,
         *    чтобы метод мог выполнять поиск минимального значения
         *    в массивах любых чисел: целых и вещественных.
         *
         * 4. С использованием отладчика проверьте корректность
         *    выполнения задания.
         */

        Integer[] integerArr = integerFactory.getInstance(20);
        Double[] doubleArr = doubleFactory.getInstance(20);

        double avg1 = Numbers.avg(integerArr);
        double avg2 = Numbers.avg(doubleArr);

        int max1 = Numbers.max(integerArr);
        double max2 = Numbers.max(doubleArr);

        int min1 = Numbers.min(integerArr);
        double min2 = Numbers.min(doubleArr);

    }
}
