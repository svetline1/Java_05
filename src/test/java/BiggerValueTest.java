import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {

    /*Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.
    Test Data:
            3333, 9999
    Expected Result = 9999

     */


        @Test
        public void BiggerValuePositiveNumbers_HappyPath() {
            //AAA
            //arrange
            int k = 3333;
            int l = 9999;

            int expectedResult = 9999;

            //act
            int actualResult = new BiggerValue().biggerValue(k, l);

            //assert
            Assert.assertEquals(actualResult, expectedResult);
        }

    @Test
    public void BiggerValueNegativeNumbers_HappyPath() {
        //AAA
        //arrange
        int k = -3333;
        int l = -9999;

        int expectedResult = -3333;

        //act
        int actualResult = new BiggerValue().biggerValue(k, l);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }




}
