package Batch_One;

public class ReverseString {
    public static StringBuilder reverse(String str) {
        return new StringBuilder().append(str).reverse();
    }

    public static void main(String[] args) {
        System.out.println(reverse("Look"));
    }
}
