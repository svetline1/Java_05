import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenValuesInArrayTest {

     /*Написать метод countEvenValuesInArray(), который принимает на вход массив целых чисел,
    и возвращает количество четных чисел в этом массиве
     */

    @Test
    public void testCountEvenValuesInArray_HappyPath() {
        //AAA
        //arrange

        int[] array = {1, 2, 3, 4, 5};
        int expectedResult = 2;

        //act
        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }


/*Написать метод countOddValuesInArray(), который принимает на вход массив целых чисел,  и возвращает
    количество нечетных чисел в этом массиве

     */

    @Test
    public void testCountOddValuesInArray_HappyPath() {
        //AAA
        //arrange

        int[] array = {1, 2, 3, 4, 5};
        int expectedResult = 3;

        //act
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }



}
