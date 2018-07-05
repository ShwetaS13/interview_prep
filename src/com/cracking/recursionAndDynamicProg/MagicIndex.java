package com.cracking.recursionAndDynamicProg;

/**
 * Created by Shweta on 8/22/2017.
 *
 * Cracking the coding interview - Chapter 8 - Recursion and Dynamic Programming
 *
 * A magic index in an array A[0...n-1] is defined to be an index such that A[i] = i.
 * Given a sorted array of distinct integers, write a method to find a magic index, if one exists, in array A.
 *
 * Follow up: What if the values are not distinct?
 */
public class MagicIndex {
    public static void main(String[] args) {

    }

    private int getMagicIndex(int[] array){
        if(array == null || array.length <=0){
            return -1;
        }

        return getMagicIndex(array, 0, array.length -1);
    }

    private int getMagicIndex(int[] array, int start, int end){
        if(start > end){
            return  -1;
        }

        int mid = (start + end) / 2;
        if(array[mid] == mid){
            return mid;
        } else if (array[mid] > mid) {
            return getMagicIndex(array, 0, mid - 1);
        } else {
            return getMagicIndex(array, mid + 1, end);
        }
    }

    /**
     * method to return the magic index for an array with distinct values
     */
    private int getMagicIndex_distinct(int[] array) {
        if(array == null || array.length <=0){
            return -1;
        }

        return getMagicIndex_distinct(array, 0, array.length -1);
    }

    private int getMagicIndex_distinct(int[] array, int start, int end){
        if(start > end){
            return -1;
        }

        int mid = (start + end) / 2;
        if(array[mid] == mid){
            return mid;
        }

        //Search left
        int leftIndex = Math.min(array[mid], mid - 1);
        int left = getMagicIndex_distinct(array, start, leftIndex);
        if(left >= 0){
            return left;
        }

        //Search right
        int rightIndex = Math.max(array[mid], mid + 1);
        int right = getMagicIndex_distinct(array, rightIndex, end);
        return right;
    }
}
