public class OddEvenValuesInArray {

    /*Написать метод countEvenValuesInArray(), который принимает на вход массив целых чисел,
    и возвращает количество четных чисел в этом массиве
    */

    public int countEvenValuesInArray(int array[]) {

        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counter +=1;
            }
        }

        return counter;
    }



    /*Написать метод countOddValuesInArray(), который принимает на вход массив целых чисел,  и возвращает
    количество нечетных чисел в этом массиве

     */

    public int countOddValuesInArray(int array[]) {

        int counter = array.length;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counter -= 1;
            }
        }

        return counter;
    }





}
