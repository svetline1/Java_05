public class OddIndices {

    /*Написать алгоритм OddIndices, который принимает массив целых чисел,  и возвращает массив значений нечетных индексов
    Test Data:
    Input = {-45, 590, 234, 985, 12, 68}
    Expected Result =  {590, 985, 68}

     */

    public int[] oddIndices(int[] array) {

        if (array.length == 0) {
            return array;

        } else if (array.length % 2 == 0) {
            int[] array2 = new int[(array.length/2)];
            int j = 0;

            for (int i = 1; i < array.length; i+=2, j++) {
                array2[j] = array[i];
            }


            return array2;

        }

        return array;
    }

}



