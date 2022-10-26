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
            “111“ → “This is a valid string”

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

    @Test
    public void removeAllZeros_noZeros_HappyPath() {
        //AAA
        //arrange
        String text = "111";

        String expectedResult = "This is a valid string";

        //act
        String actualResult = new StringMethods().removeAllZeros(text);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

/*Написать алгоритм removeAllSpaces.
    С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная,
     то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную строку.
    Test Data:
            “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
            “p a     n   d a   “ → “panda”

     */

    @Test
    public void removeAllSpaces_removeAllSpaces1_HappyPath() {
        //AAA
        //arrange
        String text = "    R e d     Ro ve    r Sc   h ool   ";

        String expectedResult = "RedRoverSchool";

        //act
        String actualResult = new StringMethods().removeAllSpaces(text);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void removeAllSpaces_removeAllSpaces2_HappyPath() {
        //AAA
        //arrange
        String text = "p a     n   d a   ";

        String expectedResult = "panda";

        //act
        String actualResult = new StringMethods().removeAllSpaces(text);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void removeAllSpaces_emptyString_HappyPath() {
        //AAA
        //arrange
        String text = "";

        String expectedResult = "";

        //act
        String actualResult = new StringMethods().removeAllSpaces(text);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /* Напишите метод countAs(), который принимает на вход строку и считает, сколько букв а или А
   содержится в строке. Метод возвращает количество букв a/A,  и количество букв/знаков в слове
   без букв a/A. Итоговый результат должен строится с помощью метода из видео 2.
Test Data:
“Abracadabra” → “5, 6”
“Homenum Revelio” → “0, 15”
“3 tarAmasAlatA” → “6, 8”
    */

    @Test
    public void countAs_onlyLetters_HappyPath() {
        //AAA
        //arrange
        String text = "Abracadabra";

        String expectedResult = "5, 6";

        //act
        String actualResult = new StringMethods().countAs(text);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void countAs_noAs_HappyPath() {
        //AAA
        //arrange
        String text = "Homenum Revelio";

        String expectedResult = "0, 15";

        //act
        String actualResult = new StringMethods().countAs(text);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void countAs_withNumbers_HappyPath() {
        //AAA
        //arrange
        String text = "3 tarAmasAlatA";

        String expectedResult = "6, 8";

        //act
        String actualResult = new StringMethods().countAs(text);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }


/*Напишите метод countJava(), который принимает на вход текст и проверяет, содержится ли в тексте
    хотя бы одно слово Java.
Test Data:
“As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy version Java 8 LTS in January 2019 for commercial use, although it will otherwise still support Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.” → true

“99 little bugs in a code.
99 little bugs in a code.
Take one down, and patch it around.
235 critical bugs in the code.” → false

 */

    @Test
    public void countJava_withJava_HappyPath() {
        //AAA
        //arrange
        String text = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are"
                + " the current long-term support (LTS) versions. Oracle released the last zero-cost"
                + " public update for the legacy version Java 8 LTS in January 2019 for commercial use,"
                + " although it will otherwise still support Java 8 with public updates for personal "
                + "use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8"
                + " and 11 that are still receiving security and other upgrades.";

        boolean expectedResult = true;

        //act
        boolean actualResult = new StringMethods().countJava(text);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void countJava_noJava_HappyPath() {
        //AAA
        //arrange
        String text = "99 little bugs in a code.\n"
                + "99 little bugs in a code.\n"
                + "Take one down, and patch it around.\n"
                + "235 critical bugs in the code.";

        boolean expectedResult = false;

        //act
        boolean actualResult = new StringMethods().countJava(text);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }






}
