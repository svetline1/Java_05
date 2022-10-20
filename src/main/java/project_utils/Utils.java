package project_utils;

public class Utils {


    //    Найти минимальное  значение, используя переменные (по одному методу на каждый вариант)
//    k и l
//    k, l, m
//    k, l, m, n
//    Переменные должны быть типа int

    public static int findMinOfTwo(int k, int l) {

        return Math.min(k, l);
    }

    public static int findMinOfThree(int k, int l, int m) {

        return (Math.min(k, Math.min(l, m)));
    }


    public static int findMinOfFour(int k, int l, int m, int n) {

        return (Math.min(k, (Math.min(l, Math.min(m, n)))));
    }










}
