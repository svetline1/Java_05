public class OddEven {

    /*В классе OddEven создать алгоритм oddEven(), который принимает на вход целое число,
     возвращает “Odd”,  если число нечетное, и “Even”, если число четное.
     */


    public String oddEven(int num) {
        if (Math.abs(num) % 2 == 1) {

            return "Odd";
        }

        return "Even";
    }
}
