package Batch_Two;

import java.util.ArrayList;
import java.util.List;

public class DivisibleBy3_5_15 {
    public static void main(String[] args) {
        List by_three = new ArrayList<>();
        List by_five = new ArrayList<>();
        List by_fifteen = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if (i == 0) throw new ArithmeticException("zero division error");

            if (i % 15 == 0) {
                by_fifteen.add(i);
            } else if (i % 5 == 0) {
                by_five.add(i);
            } else if (i % 3 == 0) {
                by_three.add(i);
            }
        }

        System.out.println("Divisible by 15: " + by_fifteen);
        System.out.println("Divisible by 5:" + by_five);
        System.out.println("Divisible by 3:" + by_three);
    }
}
