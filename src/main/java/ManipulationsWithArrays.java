public class ManipulationsWithArrays {

   /* Написать метод multiplуArrayByNumber(), который принимает на вход массив целых чисел и число int number.
   Метод возвращает массив тех же чисел, умноженных на number
    Например, multiplуArrayByNumber()({1, 2, 3, 4, 5}, 3) -> {3, 6, 9, 12, 15}
    */

    public int[] multiplуArrayByNumber(int array[], int num) {

        for (int i = 0; i < array.length; i++) {
            array[i] *= num;
        }

        return array;
    }

    /*Написать метод toDoubleArray(), который принимает на вход массив целых чисел,  и возвращает массив
    типа double[] из тех же чисел
    Например, toDoubleArray({1, 2, 3, 4, 5}) -> {1.0, 2.0, 3.0, 4.0, 5.0}
     */

    public double[] toDoubleArray(int array[]) {
        double doubleArray[] = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            doubleArray[i] = array[i];
        }

        return doubleArray;
    }

    /*Написать метод toIntArray(), который принимает на вход массив типа double[],  и возвращает массив типа
     int[] из тех же чисел
    Например, toIntArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {1, 2, 3, 4, 5}

     */

    public int[] toIntArray(double doubleArray[]) {
        int intArray[] = new int[doubleArray.length];

        for (int i = 0; i < doubleArray.length; i++) {
            intArray[i] = (int) doubleArray[i];
        }

        return intArray;
    }

   /* Написать метод toStringArray(), который принимает на вход массив целых чисел,
    и возвращает массив типа String[] из тех же чисел (желательно не использовать метод .toString(),
     нужно переводить вручную)
    Например, toStringArray({1, 2, 3, 4, 5}) -> {“1”, “2”, “3”, “4”, “5”}
    ;
    */

    public String[] toStringArray(int intArray[]) {
        String array[] = new String[intArray.length];

        for (int i = 0; i < intArray.length; i++) {
            array[i] = intArray[i] +"";
        }

        return array;
    }

    /* Перегрузить метод toStringArray() параметром double[]. Этот метод должен возвращать массив типа String[]
    (желательно не использовать метод .toString(), нужно переводить вручную)
    Например, toStringArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {“1.1”, “2.5”, “3.7”, “4.0”, “5.5”}

     */

    public String[] toStringArray(double doubleArray[]) {
        String array[] = new String[doubleArray.length];

        for (int i = 0; i < doubleArray.length; i++) {
            array[i] = doubleArray[i] +"";
        }

        return array;
    }

   /* В классе ManipulationsWithArrays написать метод areValuesGreaterThanNumber(), который
   принимает на вход массив целых чисел и число number. Метод возвращает значение true,
   если все элементы массива больше number, иначе возвращает false
    */

    public boolean areValuesGreaterThanNumber(int array[], int num) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= num) {

                return false;
            }
        }

        return true;

    }








}
