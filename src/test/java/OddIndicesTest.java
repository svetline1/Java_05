import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {

    /*Написать алгоритм OddIndices, который принимает массив целых чисел,  и возвращает массив значений нечетных индексов
    Test Data:
    Input = {-45, 590, 234, 985, 12, 68}
    Expected Result =  {590, 985, 68}

     */

    @Test
    public void oddIndices_evenNumbers_HappyPath() {
        //AAA
        //arrange
        int array [] = {-45, 590, 234, 985, 12, 68};

        int[] expectedResult = {590, 985, 68};

        //act
        int[] actualResult = new OddIndices().oddIndices(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void oddIndices_oddNumbers_HappyPath() {
        //AAA
        //arrange
        int array [] = {-45, 590, 234, 985, 12, 68, 55};

        int[] expectedResult = {590, 985, 68};

        //act
        int[] actualResult = new OddIndices().oddIndices(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void oddIndices_oneNumber_HappyPath() {
        //AAA
        //arrange
        int array [] = {-45};

        int[] expectedResult = {};

        //act
        int[] actualResult = new OddIndices().oddIndices(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void oddIndices_empty_HappyPath() {
        //AAA
        //arrange
        int array [] = {};

        int[] expectedResult = {};

        //act
        int[] actualResult = new OddIndices().oddIndices(array);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }


}
