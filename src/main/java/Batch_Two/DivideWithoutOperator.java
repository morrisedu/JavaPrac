package Batch_Two;

public class DivideWithoutOperator {
    public static String divideWithoutOperator(int divisor, int dividend) {
        String result;
        int count = 0;

        if (divisor == 0) throw new ArithmeticException("Divisor cannot be zero");

        if (dividend >= divisor) {
            do {
                dividend -= divisor;
                count++;
            } while (dividend >= divisor);
        }

        result = (dividend > 0) ? count + " remainder " + dividend : "" + count;

        return result;
    }
    public static void main(String[] args) {
        System.out.println(divideWithoutOperator(2, 17));
    }
}
