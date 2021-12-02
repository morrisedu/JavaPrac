package Batch_One;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static String removeDups(String str) {
        String no_dups = "";

        List<String> str_list = new ArrayList<>(Arrays.asList(str.split("")));
        for (String s : str_list) {
            if (!no_dups.contains(s)) {
                no_dups += s;
            }
        }

        return no_dups;
    }

    public static void main(String[] args) {
        System.out.println(removeDups("AAAABBBCCCDDDEFGGGHHHYYY"));
    }
}
