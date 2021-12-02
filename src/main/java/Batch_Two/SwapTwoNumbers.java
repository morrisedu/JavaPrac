package Batch_Two;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = inp.nextInt();
        System.out.print("Enter second number: ");
        int b = inp.nextInt();

        inp.close();

        // Swap
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("First number is now: " + a + " and second number is now: " + b);
    }
}
