import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {

    /*Напишите алгоритм AreNumbersEqual, который принимает на вход 2 любых int числа, и возвращает
0, если числа равны
-1, если первое число меньше второго
1, если первое число больше второго
    Test Data: 89, 89 Expected result: 0
            -89, 89  Expected result: -1
            89, -89  Expected result: 1

     */

    @Test
    public void AreNumbersEqual_Equals_HappyPath() {
        //AAA
        //arrange
        int n = 89;
        int m = 89;

        int expectedResult = 0;

        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(n, m);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void AreNumbersEqual_FirstNumLess_HappyPath() {
        //AAA
        //arrange
        int n = -89;
        int m = 89;

        int expectedResult = -1;

        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(n, m);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void AreNumbersEqual_FirstNumBigger_HappyPath() {
        //AAA
        //arrange
        int n = 89;
        int m = -89;

        int expectedResult = 1;

        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(n, m);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }



}
