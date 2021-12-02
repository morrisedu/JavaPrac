package Batch_Two;

public class OddOrEven {
    public static String identify(int a) {
        return (a % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        System.out.println("identify(6) = " + identify(6));
    }
}
