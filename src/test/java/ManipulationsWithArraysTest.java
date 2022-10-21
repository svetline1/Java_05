import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {

    /* Написать метод multiplуArrayByNumber(), который принимает на вход массив целых чисел и число int number.
   Метод возвращает массив тех же чисел, умноженных на number
    Например, multiplуArrayByNumber()({1, 2, 3, 4, 5}, 3) -> {3, 6, 9, 12, 15}
    */

    @Test
    public void testMultiplуArrayByNumber_HappyPath() {
        //AAA
        //arrange

        int[] array = {1, 2, 3, 4, 5};
        int num = 3;
        int[] expectedResult = {3, 6, 9, 12, 15};

        //act
        int[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(array, num);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

     /*Написать метод toDoubleArray(), который принимает на вход массив целых чисел,  и возвращает массив
    типа double[] из тех же чисел
    Например, toDoubleArray({1, 2, 3, 4, 5}) -> {1.0, 2.0, 3.0, 4.0, 5.0}
     */

    @Test
    public void testToDoubleArray_HappyPath() {
        //AAA
        //arrange

        int[] array = {1, 2, 3, 4, 5};
        double[] expectedResult = {1.0, 2.0, 3.0, 4.0, 5.0};

        //act
        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

/*Написать метод toIntArray(), который принимает на вход массив типа double[],  и возвращает массив типа
     int[] из тех же чисел
    Например, toIntArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {1, 2, 3, 4, 5}

     */

    @Test
    public void testToIntArray_HappyPath() {
        //AAA
        //arrange

        double[] array = {1.1, 2.5, 3.7, 4.0, 5.5};
        int[] expectedResult = {1, 2, 3, 4, 5};

        //act
        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

/* Написать метод toStringArray(), который принимает на вход массив целых чисел,
    и возвращает массив типа String[] из тех же чисел (желательно не использовать метод .toString(),
     нужно переводить вручную)
    Например, toStringArray({1, 2, 3, 4, 5}) -> {“1”, “2”, “3”, “4”, “5”}
    ;
    */

    @Test
    public void testToStringArrayInt_HappyPath() {
        //AAA
        //arrange

        int[] array = {1, 2, 3, 4, 5};
        String[] expectedResult = {"1", "2", "3", "4", "5"};

        //act
        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

/* Перегрузить метод toStringArray() параметром double[]. Этот метод должен возвращать массив типа String[]
    (желательно не использовать метод .toString(), нужно переводить вручную)
    Например, toStringArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {“1.1”, “2.5”, “3.7”, “4.0”, “5.5”}

     */

    @Test
    public void testToStringArrayDouble_HappyPath() {
        //AAA
        //arrange

        double[] array = {1.1, 2.5, 3.7, 4.0, 5.5};
        String[] expectedResult = {"1.1", "2.5", "3.7", "4.0", "5.5"};

        //act
        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }







}
