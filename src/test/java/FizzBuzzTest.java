import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FizzBuzzTest {

    //1. Positive testing Happy path
    // if (start <= end)
    //return array;

    //start < end
    @Test
    public void testStartLessThanEnd_HappyPath() {
        //AAA
        //arrange
        int start = 1;
        int end = 20;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8",
                "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};

        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start,end);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
        }



    //start == end
    @Test
    public void testStartEqualsEnd_HappyPath() {
        //AAA
        //arrange
        int start = 1;
        int end = 1;
        String[] expectedResult = {"1"};

        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start,end);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //start < end
    //@Ignore
    @Test
    public void testStartLessThanEnd_StartEndAreNegative_HappyPath() {
        //AAA
        //arrange
        int start = -20;
        int end = -1;
        String[] expectedResult = {"Buzz", "-19", "Fizz", "-17", "-16", "FizzBuzz", "-14", "-13", "Fizz", "-11",
                "Buzz", "Fizz", "-8", "-7", "Fizz", "Buzz", "-4", "Fizz", "-2", "-1"};

        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start,end);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Negative testing
    // if (start > end)
    //return new String[0];

    @Test
    public void testStartGreaterThanEnd_Negative() {
        //AAA
        //arrange
        int start = 20;
        int end = 1;
        String[] expectedResult = {};

        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start,end);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    /*Given an integer M perform the following conditional actions:
    If M is multiple of 7 and 9 then return "Good Number".
    If M is only multiple of 9 and not of 7  then return "Bad Number"
    If M is only multiple of 11 then return "Poor Number"
    If M doesn't satisfy any of the above conditions then return "-1"

     */


    @Test
    public void whatNumberIsM_div7and9_HappyPath() {
        //AAA
        //arrange
        int M = 63;
        String expectedResult = "Good Number";

        //act
        String actualResult = new FizzBuzz().whatNumberIsM(M);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void whatNumberIsM_div9_HappyPath() {
        //AAA
        //arrange
        int M = 81;
        String expectedResult = "Bad Number";

        //act
        String actualResult = new FizzBuzz().whatNumberIsM(M);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void whatNumberIsM_div11_HappyPath() {
        //AAA
        //arrange
        int M = 121;
        String expectedResult = "Poor Number";

        //act
        String actualResult = new FizzBuzz().whatNumberIsM(M);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void whatNumberIsM_notDiv7or9or11_HappyPath() {
        //AAA
        //arrange
        int M = 3;
        String expectedResult = "-1";

        //act
        String actualResult = new FizzBuzz().whatNumberIsM(M);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void whatNumberIsM_mIsZero_HappyPath() {
        //AAA
        //arrange
        int M = 0;
        String expectedResult = "Good Number";

        //act
        String actualResult = new FizzBuzz().whatNumberIsM(M);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
