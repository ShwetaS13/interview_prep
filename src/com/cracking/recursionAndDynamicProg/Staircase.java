package com.cracking.recursionAndDynamicProg;

/**
 * Print staircase of #
 * Eg:  if n = 6, the print-
 *      #
 *     ##
 *    ###
 *   ####
 *  #####
 * ######
 */
public class Staircase {

    public static void main(String args[]){
        Staircase staircase = new Staircase();
        staircase.printStaircase(6);
    }

    public void printStaircase(int n){
        for(int i = 1; i <= n; i++){
            for(int j = n - i; j > 0 ; j--){
                System.out.print(" ");
            }

            for(int k = i; k > 0; k--){
                System.out.print("#");
            }

            System.out.println();
        }
    }
}
