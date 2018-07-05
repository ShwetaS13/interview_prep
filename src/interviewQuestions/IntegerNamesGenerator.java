package interviewQuestions;

import java.util.HashMap;

/**
 8
 eight
 171330167
 one hundred seventy one million three hundred thirty thousand one hundred sixty seven

 1- one
 2- two

 3- hundred
 4, 5 - thousand

 11 - eleven
 12 - twelve
 ... 19
 2 - twenty
 3- thirty

 11 - eleven
 21- ---one

 123 - one hundred twenty three
 1234
 12345
 123456 -
 101 - one hundred one
 100
 *
 */
public class IntegerNamesGenerator {
    private HashMap<Integer, String> units = new HashMap<>();// {1 - "One",..., 9-"Nine"}
    private HashMap<Integer, String> tens = new HashMap<>(); //{ 10- "Ten",11 - eleven ,... , 19- "Nineteen", 2 - "Twenty", .. , 9 - "Ninety"}
    private StringBuilder sb = new StringBuilder();

    public static void main(String args[]) {
        IntegerNamesGenerator ing = new IntegerNamesGenerator();
        ing.makeTensMap();
        ing.makeUnitsMap();
        int n = 100;
        System.out.println(n+" --> "+ing.getName(n));
    }

    private void makeUnitsMap() {
        units.put(1, "One ");
        units.put(2, "Two ");
        units.put(3, "Three ");
        units.put(4, "Four ");
        units.put(5, "Five ");
        units.put(6, "Six ");
        units.put(7, "Seven ");
        units.put(8, "Eight ");
        units.put(9, "Nine ");
    }

    private void makeTensMap() {
        tens.put(10, "Ten ");
        tens.put(11, "Eleven ");
        tens.put(12, "Twelve ");
        tens.put(13, "Thirteen ");
        tens.put(14, "Fourteen ");
        tens.put(15, "Fifteen ");
        tens.put(16, "Sixteen ");
        tens.put(17, "Seventeen ");
        tens.put(18, "Eighteen ");
        tens.put(19, "Nineteen ");
        tens.put(2, "Twenty ");
        tens.put(3, "Thirty ");
        tens.put(4, "Forty ");
        tens.put(5, "Fifty ");
        tens.put(6, "Sixty ");
        tens.put(7, "Seventy ");
        tens.put(8, "Eighty ");
        tens.put(9, "Ninety ");
    }

    private String getName(int number){
        String numberString = String.valueOf(number);
        switch(numberString.length()){
            case 0:
                break;
            case 1:
                if (getInt(numberString) > 0) {
                    sb.append(units.get(getInt(numberString.charAt(0))));
                }
                break;

            case 2:
                if(numberString.charAt(0) == '1'){
                    sb.append(tens.get(getInt(numberString)));
                }else if (numberString.charAt(0) > 1){
                    sb.append(tens.get(getInt(String.valueOf(numberString.charAt(0)))));
                    if(getInt(String.valueOf(numberString.charAt(1))) > 0) {
                        sb.append(units.get(getInt(numberString.charAt(1))));
                    }
                }else if(numberString.charAt(0) == 0 && numberString.charAt(1) != 0) {
                    sb.append(units.get(getInt(numberString.charAt(1))));
                }
                break;

            case 3:
                sb.append(units.get(getInt(numberString.charAt(0))));
                sb.append("Hundred ");
                getName(Integer .valueOf(numberString.substring(1)));
                break;

            case 4:
            case 5:
            case 6:
                getName(Integer.valueOf(numberString.substring(0, numberString.length() - 3)));
                sb.append("Thousand ");
                getName(Integer.valueOf(numberString.substring(numberString.length() - 3, numberString.length())));
                break;

            case 7:
            case 8:
            case 9:
                getName(Integer.valueOf(numberString.substring(0, numberString.length() - 6)));
                sb.append("Million ");
                getName(Integer.valueOf(numberString.substring(numberString.length() - 6, numberString.length())));
                break;
        }
        return sb.toString();
    }

    private int getInt(String s) {
        return Integer.parseInt(s);
    }

    private int getInt(char c) {
        return getInt(String.format("%c", c));
    }

}