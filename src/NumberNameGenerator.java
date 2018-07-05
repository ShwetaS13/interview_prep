import java.util.HashMap;
import java.util.Scanner;

/**
 * Given an Integer, return the word form of the Integer
 */
public class NumberNameGenerator {
    HashMap<Integer, String> onesMap = null;
    HashMap<Integer, String> tensMap = null;

    private void createMaps() {
        onesMap = new HashMap<>();
        tensMap = new HashMap<>();
        createOnesMap();
        createTensMap();
    }

    private void createOnesMap() {
        onesMap.put(1, "One");
        onesMap.put(2, "Two");
        onesMap.put(3, "Three");
        onesMap.put(4, "Four");
        onesMap.put(5, "Five");
        onesMap.put(6, "Six");
        onesMap.put(7, "Seven");
        onesMap.put(8, "Eight");
        onesMap.put(9, "Nine");
    }

    private void createTensMap() {
        onesMap.put(1, "Ten");
        onesMap.put(2, "Twenty");
        onesMap.put(3, "Thirty");
        onesMap.put(4, "Forty");
        onesMap.put(5, "Fifty");
        onesMap.put(6, "Sixty");
        onesMap.put(7, "Seventy");
        onesMap.put(8, "Eighty");
        onesMap.put(9, "Ninety");
    }

    private String generate(int number) {
        int no = number % 1000;

        if(no == 0) {
            return "";
        }else {
            gen(no);
        }


        return generate(no / 1000);
    }

    private String gen(int number) {
        if(number == 0) {
            return "";
        }

        int num = number / 100;
        if(num == 0) {
            return "" + gen(number % 100);
        }else {
            return "something"+ "hundred" + gen(number % 100);
        }

    }


    public static void main(String args[]){
        NumberNameGenerator numberNameGenerator = new NumberNameGenerator();
        int number = 12345;
        numberNameGenerator.generate(number);
    }
}