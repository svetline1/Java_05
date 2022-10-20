import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {


    /* Напишите алгоритм IsPositiveNumber, который возвращает true, если численный  параметр больше или равен нулю, и
     возвращает false, если параметр меньше 0.
    Проверьте работу метода на числах 555, 0 и -555.
     */

    @Test
    public void IsPositiveNumber_PositiveNumber_HappyPath() {
        //AAA
        //arrange
        int num = 555;

        boolean expectedResult = true;

        //act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(num);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void IsPositiveNumber_Zero_HappyPath() {
        //AAA
        //arrange
        int num = 0;

        boolean expectedResult = true;

        //act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(num);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void IsPositiveNumber_NegativeNumber_HappyPath() {
        //AAA
        //arrange
        int num = -555;

        boolean expectedResult = false;

        //act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(num);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }



}
