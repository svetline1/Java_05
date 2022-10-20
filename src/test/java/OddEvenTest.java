import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

// Positive testing Happy path
//             Test Data:
//            -345 →  “Odd”
//            0 →  “Even”
//            222222 →  “Even”

    @Test
    public void oddNumber_HappyPath() {
        //AAA
        //arrange
        int num = -345;

        String expectedResult = "Odd";

        //act
        String actualResult = new OddEven().oddEven(num);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void Zero_HappyPath() {
        //AAA
        //arrange
        int num = 0;

        String expectedResult = "Even";

        //act
        String actualResult = new OddEven().oddEven(num);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void evenNumber_HappyPath() {
        //AAA
        //arrange
        int num = 222222;

        String expectedResult = "Even";

        //act
        String actualResult = new OddEven().oddEven(num);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }




}
