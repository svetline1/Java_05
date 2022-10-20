import java.util.Arrays;

public class CreateArray {

   /* метод createIntArray(), который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел.
    Например, createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}
    */

    public int[] createIntArray(int num1, int num2, int num3, int num4, int num5) {

        int[] array = {num1, num2, num3, num4, num5};

        return array;
    }

    /* Написать метод createDoubleArray(), который принимает на вход 5 чисел типа double, и возвращает массив из этих же чисел
    Например, createDoubleArray(1.1, 2.5, 3.7, 4.0, 5.5) -> {1.1, 2.5, 3.7, 4.0, 5.5}

     */

    public double[] createDoubleArray(double num1, double num2, double num3, double num4, double num5) {

        double[] array = {num1, num2, num3, num4, num5};

        return array;
    }

    /*Написать метод createStringArray(), который принимает на вход 5 слов, и возвращает массив из этих слов
    Например, createStringArray(“It”, “was”, “an”, “apple”, “pie”) -> {“It”, “was”, “an”, “apple”, “pie”}

     */

    public String[] createStringArray(String word1, String word2, String word3, String word4, String word5) {

        String[] array = {word1, word2, word3, word4, word5};

        return array;
    }








}
