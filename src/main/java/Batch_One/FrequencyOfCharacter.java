package Batch_One;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "AABBCDD";

        List<String> str_list = new ArrayList<>(Arrays.asList(str.split("")));

        System.out.println("str_list = " + str_list);

        String freq = "";

        for (String s : str_list) {
            if (!freq.contains(s)) {
                freq += s + Collections.frequency(str_list, s);
            }
        }

        System.out.println("freq = " + freq);
    }
}
