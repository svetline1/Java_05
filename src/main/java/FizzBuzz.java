public class FizzBuzz {

    public String[] fizzBuzz(int start, int end) {

        if (start <= end){
            String[] array = new String[end - start +1];

            int number = start;

            for (int i = 0; i < array.length && number <= end; i++) {
                if (number % 15 == 0) {
                    array[i] = "FizzBuzz";
                } else if (number % 3 == 0) {
                    array[i] = "Fizz";
                } else if (number % 5 == 0) {
                    array[i] = "Buzz";
                } else {
                    array[i] = String.valueOf(number);
                }

                number++;
            }

            return array;
        }

        return new String[0];

    }


    /*Given an integer M perform the following conditional actions:
    If M is multiple of 7 and 9 then return "Good Number".
    If M is only multiple of 9 and not of 7  then return "Bad Number"
    If M is only multiple of 11 then return "Poor Number"
    If M doesn't satisfy any of the above conditions then return "-1"

     */

    public String whatNumberIsM(int M) {

                if (M % 63 == 0 ) {

                    return "Good Number";
                } else if (M % 9 == 0) {

                    return "Bad Number";
                } else if (M % 11 == 0) {

                    return "Poor Number";
                } else {

                    return "-1";
                }
    }










}
