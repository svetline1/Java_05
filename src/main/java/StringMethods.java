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
        } if (text.equals(text.trim())) {

            return "Пробелов не было";
        }else{
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
            text = text.replace(" ", ""); {

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





}
