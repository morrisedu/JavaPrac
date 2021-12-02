package Batch_Two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.arraycopy;

public class CombineArrays {
    public static Object[] mergeArrays(Object[] arr1, Object[] arr2) {
        List list = new ArrayList(Arrays.asList(arr1));
        list.addAll(Arrays.asList(arr2));

        return list.toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArrays(new String[]{"A", "E", "I"}, new String[]{"O", "U"})));
    }
}
