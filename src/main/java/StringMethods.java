public class StringMethods {

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

    public String removeSpaces(String text) {

        if (text.isEmpty() == true) {

            return "Строка пустая";
        }
        if (text.equals(text.trim())) {

            return "Пробелов не было";
        } else {
            text = text.trim();

            return "Лишние пробелы удалены";
        }


    }

    /*Написать алгоритм removeAllAs().
    С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная,
     то метод удаляет все буквы a из строки, если таковые имеются. Метод возвращает обработанную строку.
    Test Data:
            “    Red Rover School   “ →  “Red Rover School“
            “panda   “ → “pnd”
            “taramasalata” → “trmslt”

     */

    public String removeAllAs(String text) {

        if (text.isEmpty() != true) {
            text = text.trim().replace("a", "");

            return text;
        }

        return "";
    }

    /*Написать алгоритм removeAllZeros().
    С помощью методов из видео1,  написать алгоритм, который принимает на вход строку, состоящую из цифр.
    Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
    Метод возвращает обработанную строку, в которой нет нулей. Если в строке не было нулей,
    метод возвращает сообщение “This is a valid string”.
    Test Data:
            “3504209706040000 “ →  “35429764“
            “0000000111“ → “111”

     */

    public String removeAllZeros(String text) {

        if (text.isEmpty() != true) {
            text = text.replace(" ", "");
            {

                if (text.equals(text.replace("0", ""))) {

                    return "This is a valid string";
                } else {
                    text = text.replace("0", "");

                    return text;
                }
            }
        }

        return "";
    }

    /*Написать алгоритм removeAllSpaces.
    С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная,
     то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную строку.
    Test Data:
            “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
            “p a     n   d a   “ → “panda”

     */

    public String removeAllSpaces(String text) {

        if (text.isEmpty() != true) {
            text = text.replace(" ", "");
            {

                return text;
            }
        }

        return "";
    }

   /* Напишите метод countAs(), который принимает на вход строку и считает, сколько букв а или А
   содержится в строке. Метод возвращает количество букв a/A,  и количество букв/знаков в слове
   без букв a/A. Итоговый результат должен строится с помощью метода из видео 2.
Test Data:
“Abracadabra” → “5, 6”
“Homenum Revelio” → “0, 15”
“3 tarAmasAlatA” → “6, 8”

    */

    public String countAs(String text) {

        if (text.isEmpty() != true) {

            int counter = 0;

            for (int i = 0; i < text.length(); i += 1) {

                if (text.toLowerCase().substring(i, i + 1).contains("a")) {
                    counter += 1;
                }
            }

            return ("" + counter + ", " + (text.length() - counter));
        }

        return "0";
    }

    /*Напишите метод countJava(), который принимает на вход текст и проверяет, содержится ли в тексте
    хотя бы одно слово Java.

    Test Data:
            “support Java 8 with public updates for personal use indefinitely. Other vendors have begun to”
        → true

            “9wn, and patch it around.
            235 critical bugs in the code.” → false
     */


    public boolean countJava(String text) {
        if (text.toLowerCase().contains("java")) {

            return true;
        }

        return false;
    }

    /*
    Напишите метод insertQuotes(), который принимает слово и возвращает строку, в которой это слово “обернуто” в кавычки:

    Test Data:
            “Abracadabra” →  ““Abracadabra””

     */

    public String insertQuotes(String text) {
        String Quote = "\"";

        return Quote.concat(text.concat(Quote));
    }

    /*Напишите метод  fixCityName, кторый принимает на вход название города и исправляет написание:
    Test Data:
            “ташкент” → “Ташкент”
            “ЧикаГО” → “Чикаго”

     */

    public String fixCityName(String text) {
        if (text.length() > 0)  {

            return "" + text.toUpperCase().charAt(0) + text.substring(1).toLowerCase();
        }

        return "";
        }

    /*Напишите метод, который принимает на вход строку и букву-параметр, и возвращает все, что
    находится между первой и последней буквой-параметром:
    Test Data:
            “Abracadabra”, “b” → “bracadab”
            “Whippersnapper”, “p” → “ppersnapp”
     */

    public String returnTextBetweenLetter(String text, char letter) {
        if ((text.length() > 0) && (text.contains("" + letter) )) {

            return text.substring(text.indexOf(letter), text.lastIndexOf(letter) + 1);
        }

        return "-1";
    }


    /*Напишите метод, который принимает на вход слово, и возвращает true, если слово начинается и
     заканчивается на одинаковую букву, и false иначе
    Test Data:
            “Abracadabra” → true
            “Whippersnapper” → false

     */

    public boolean startsAndEndsWithSameLetter(String text) {
        if ((text.length() > 0)) {
            if (text.lastIndexOf(text.toLowerCase().charAt(0)) == text.length() - 1) {

                return true;
            }

            return false;
        }

        return false;
    }



}