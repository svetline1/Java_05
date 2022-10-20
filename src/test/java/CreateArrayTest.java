import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateArrayTest {

   /* метод createIntArray(), который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел.
    Например, createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}
    */

    @Test
    public void createIntArray_HappyPath() {
        //AAA
        //arrange
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;

        int[] expectedResult = {1, 2, 3, 4, 5};

        //act
        int[] actualResult = new CreateArray().createIntArray(num1, num2, num3, num4, num5);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /* Написать метод createDoubleArray(), который принимает на вход 5 чисел типа double, и возвращает массив из этих же чисел
    Например, createDoubleArray(1.1, 2.5, 3.7, 4.0, 5.5) -> {1.1, 2.5, 3.7, 4.0, 5.5}

     */

    @Test
    public void createDoubleArray_HappyPath() {
        //AAA
        //arrange
        double num1 = 1.1;
        double num2 = 2.5;
        double num3 = 3.7;
        double num4 = 4.0;
        double num5 = 5.5;

        double[] expectedResult = {1.1, 2.5, 3.7, 4.0, 5.5};

        //act
        double[] actualResult = new CreateArray().createDoubleArray(num1, num2, num3, num4, num5);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*Написать метод createStringArray(), который принимает на вход 5 слов, и возвращает массив из этих слов
    Например, createStringArray(“It”, “was”, “an”, “apple”, “pie”) -> {“It”, “was”, “an”, “apple”, “pie”}

     */

    @Test
    public void createStringArray_HappyPath() {
        //AAA
        //arrange
        String word1 = "It";
        String word2 = "was";
        String word3 = "an";
        String word4 = "apple";
        String word5 = "pie";

        String[] expectedResult = {"It", "was", "an", "apple", "pie"};

        //act
        String[] actualResult = new CreateArray().createStringArray(word1, word2, word3, word4, word5);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }



}
