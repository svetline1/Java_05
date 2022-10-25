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

/*Написать алгоритм removeAllAs().
    С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная,
     то метод удаляет все буквы a из строки, если таковые имеются. Метод возвращает обработанную строку.
    Test Data:
            “    Red Rover School   “ →  “Red Rover School“
            “panda   “ → “pnd”
            “taramasalata” → “trmslt”

     */

    @Test
    public void removeAllAs_removeSpaces_HappyPath() {
        //AAA
        //arrange
        String text = "    Red Rover School   ";

        String expectedResult = "Red Rover School";

        //act
        String actualResult = new StringMethods().removeAllAs(text);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void removeAllAs_removeSpacesAndAs_HappyPath() {
        //AAA
        //arrange
        String text = "panda   ";

        String expectedResult = "pnd";

        //act
        String actualResult = new StringMethods().removeAllAs(text);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void removeAllAs_removeAs_HappyPath() {
        //AAA
        //arrange
        String text = "taramasalata";

        String expectedResult = "trmslt";

        //act
        String actualResult = new StringMethods().removeAllAs(text);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

/*Написать алгоритм removeAllZeros().
    С помощью методов из видео1,  написать алгоритм, который принимает на вход строку, состоящую из цифр.
    Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
    Метод возвращает обработанную строку, в которой нет нулей. Если в строке не было нулей,
    метод возвращает сообщение “This is a valid string”.
    Test Data:
            “3504209706040000 “ →  “35429764“
            “0000000111“ → “111”

            "" →  ""

     */

    @Test
    public void removeAllZeros_removeZerosAndSpaces_HappyPath() {
        //AAA
        //arrange
        String text = "3 504209706040000 ";

        String expectedResult = "35429764";

        //act
        String actualResult = new StringMethods().removeAllZeros(text);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void removeAllZeros_removeZeros_HappyPath() {
        //AAA
        //arrange
        String text = "0000000111";

        String expectedResult = "111";

        //act
        String actualResult = new StringMethods().removeAllZeros(text);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void removeAllZeros_emptyString_HappyPath() {
        //AAA
        //arrange
        String text = "";

        String expectedResult = "";

        //act
        String actualResult = new StringMethods().removeAllZeros(text);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }






}
