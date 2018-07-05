package com.cracking.recursionAndDynamicProg;

import java.util.HashMap;

/**
 * Created by Shweta on 6/3/2018.
 */
public class TripleStep {
    private HashMap<Integer, Integer> map = new HashMap<>();

    private int countSteps(int n) {
        if(n < 0 ){
            return 0;
        }

        //base case
        if(n == 0){
            return 1;
        }

        if (!map.containsKey(n)) {
            map.put(n, countSteps(n - 1) + countSteps(n - 2) + countSteps(n - 3));
        }

        return map.get(n);
    }

    private int alternateWay(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;

        if (!map.containsKey(n)) {
            map.put(n, alternateWay(n - 1) + alternateWay(n - 2) + alternateWay(n - 3));
        }

        return map.get(n);
    }

    public static void main(String args[]) {
        int numberOfSteps = 4;
        TripleStep tripleStep = new TripleStep();
        System.out.println("Possible Ways to climb up " + numberOfSteps + " : " + tripleStep.countSteps(numberOfSteps));
        System.out.println("Possible Ways to climb up " + numberOfSteps + " alternately : " + tripleStep.alternateWay(numberOfSteps));

    }
}
