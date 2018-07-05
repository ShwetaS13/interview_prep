package com.cracking.recursionAndDynamicProg;

import java.util.HashMap;

/**
 * Created by Shweta on 6/23/2018.
 * Write a recursive function to multiply two positive integers without using the * or / operators.
 * You can use the addition, subtraction and bit shifting, but you should minimize the number of operations.
 */
public class RecursiveMultiply {
    public static void main(String args[]){
        int a = 5;
        int b = 5;

        RecursiveMultiply rm = new RecursiveMultiply();
        System.out.println(rm.recursiveMultiply(a, b));
        System.out.println(rm.alternateRecursiveMultiply(a, b));    //Better Solution O(smaller)
    }

    private int recursiveMultiply(int a, int b){
        if (a == 0 || b == 0) {
            return 0;
        }

        if(a < 0 || b < 0){
            return -1;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int smaller = a < b ? a : b;
        int bigger = a > b ? a : b;
        return multiply(map, bigger, smaller);
    }

    private int multiply(HashMap<Integer, Integer> map, int a, int b){
        if(b <= 0){
            return 0;
        }

        if(b == 1){
            return a;
        }

        if (!map.containsKey(b)) {
            int firstHalf = b >> 1;
            int secondHalf = b - firstHalf;

            map.put(b, multiply(map, a, firstHalf) + multiply(map, a, secondHalf));
        }

        return map.get(b);
    }

    private int alternateRecursiveMultiply(int a, int b){
        if (a == 0 || b == 0) {
            return 0;
        }

        if(a < 0 || b < 0){
            return -1;
        }

        int smaller = a < b ? a : b;
        int bigger = a > b ? a : b;
        return alternateMultiply(bigger, smaller);
    }

    private int alternateMultiply(int a, int b){
        if(b <= 0){
            return 0;
        }

        if(b == 1){
            return a;
        }

        int halfProduct = alternateMultiply(a, b >> 1);
        int fullProduct = halfProduct + halfProduct;
        if(b % 2 == 0){
            return fullProduct;
        }else{
            return fullProduct + a;
        }

    }
}
