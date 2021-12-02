package Batch_One;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Uniques {
    public static String uniqueCharacters(String str) {
        String uniques = "";

        List<String> str_list = new ArrayList<>(Arrays.asList(str.split("")));

        for (String s : str_list) {
            if (Collections.frequency(str_list, s) == 1) {
                uniques += s;
            }
        }

        return uniques;
    }

    public static void main(String[] args) {
        System.out.println(uniqueCharacters("AAABBBCCCDEF"));
    }
}
