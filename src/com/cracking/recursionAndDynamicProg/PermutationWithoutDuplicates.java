package com.cracking.recursionAndDynamicProg;

import java.util.ArrayList;

/**
 * Created by Shweta on 6/26/2018.
 */
public class PermutationWithoutDuplicates {
    public static void main(String args[]) {
        String s = "string";
        PermutationWithoutDuplicates pwd = new PermutationWithoutDuplicates();
        System.out.println(pwd.getPerms(s));
    }

    private ArrayList<String> getPerms(String input){
        if(input == null || input.length() <= 0){
            return null;
        }

        ArrayList<String> result = new ArrayList<>();

        getPerms("", input, result);
        return result;
    }

    private void getPerms(String prefix, String remainder, ArrayList<String> result){
        if (remainder.length() == 0) {
            result.add(prefix);
        }

        int len = remainder.length();
        for(int i = 0; i < len; i++){
            String left = remainder.substring(0, i);
            String right = remainder.substring(i + 1, len);
            char ch = remainder.charAt(i);
            getPerms(prefix + ch, left + right, result);
        }

    }
}