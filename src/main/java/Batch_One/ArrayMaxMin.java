package Batch_One;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayMaxMin {
    public static int arrayMin(int[] arr) {
        return Collections.min(Arrays.stream(arr).boxed().collect(Collectors.toList()));
    }

    public static int arrayMax(int[] arr) {
        return Collections.max(Arrays.stream(arr).boxed().collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        System.out.println(arrayMin(new int[]{8, 66, 43, 86, 5, 5}));
        System.out.println(arrayMax(new int[]{8, 66, 43, 86, 5, 5}));
    }
}
