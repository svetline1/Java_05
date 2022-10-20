import org.testng.Assert;
import org.testng.annotations.Test;


/*Написать алгоритм SumArray, который возвращает сумму всех чисел массива
    Test Data:
    {0, 1, 2, 3, 4, 5} → 15
    {-7, -3} → -10

     */

public class SumArrayTest {

    @Test
    public void sumArrayPositiveNumbers_HappyPath() {
        //AAA
        //arrange
        int [] array = {0, 1, 2, 3, 4, 5};

        int expectedResult = 15;

        //act
        int actualResult = new SumArray().sumArray(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void sumArrayNegativeNumbers_HappyPath() {
        //AAA
        //arrange
        int [] array = {-7, -3};

        int expectedResult = -10;

        //act
        int actualResult = new SumArray().sumArray(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void sumArrayZero_HappyPath() {
        //AAA
        //arrange
        int [] array = {0, 0};

        int expectedResult = 0;

        //act
        int actualResult = new SumArray().sumArray(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }





}
