import org.testng.Assert;
import org.testng.annotations.Test;

public class StringMethodsTest {

    /*Написать метод removeSpaces(), который принимает на вход строку.
    Если строка не пустая (проверить методом класса String), то примените метод по удалению пробелов
    в начале и в конце строки.
    Догадаться, каким методом из видео можно проверить, были ли пробелы в строке.
    Если пробелы были, то метод должен удалить их и вернуть сообщение: “Лишние пробелы удалены”.
    Если пробелов не было, вернуть сообщение “Пробелов не было”.
    Если строка пустая (проверить методом класса String), вернуть сообщение “Строка пустая”.

    Test Data:
            “    Red Rover School   “ → “Лишние пробелы удалены”
            “Red Rover School“ → “Пробелов не было”
            “” → “Строка пустая”

     */

    @Test
    public void removeSpaces_gotSpaces_HappyPath() {
        //AAA
        //arrange
        String text = "    Red Rover School   ";

        String expectedResult = "Лишние пробелы удалены";

        //act
        String actualResult = new StringMethods().removeSpaces(text);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void removeSpaces_noSpaces_HappyPath() {
        //AAA
        //arrange
        String text = "Red Rover School";

        String expectedResult = "Пробелов не было";

        //act
        String actualResult = new StringMethods().removeSpaces(text);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void removeSpaces_emptyString_HappyPath() {
        //AAA
        //arrange
        String text = "";

        String expectedResult = "Строка пустая";

        //act
        String actualResult = new StringMethods().removeSpaces(text);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }



}
