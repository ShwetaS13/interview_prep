package com.cracking.recursionAndDynamicProg;

import java.util.ArrayList;

/**
 * Created by Shweta on 6/27/2018.
 * Write a method to compute all the permutations of a string whose characters are not necessarily unique.
 * The list of permutations should not have duplicates.
 */
public class PermutationWithDuplicates {

    public static void main(String args[]) {
        String s = "abac";
        String s1 = "abcd";
        PermutationWithDuplicates p = new PermutationWithDuplicates();
        System.out.println(p.getPerms(s));
        System.out.println(p.getPerms(s1));
    }

    private ArrayList<String> getPerms(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }

        ArrayList<String> result = new ArrayList<>();

        getPerms("", str, result);
        return result;
    }

    private void getPerms(String prefix, String remainder, ArrayList<String> result) {
        if (remainder.length() == 0) {
            if(!result.contains(prefix)){
                result.add(prefix);
            }
        }

        int len = remainder.length();
        for(int i = 0; i < len; i++) {
            String before = remainder.substring(0, i);
            String after = remainder.substring(i + 1, len);
            char c = remainder.charAt(i);
            getPerms(prefix + c, before + after, result);
        }
    }
}
