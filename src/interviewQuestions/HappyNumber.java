package interviewQuestions;
/*
 * A happy number is a number where the sum of the square of the digits eventually resolves to 1.
 Ex: 100
 1^2 + 0^2 + 0^2 = 1 :)

 Ex: 145 :(
 1^2 + 4^2 + 5^2 = 42
 4^2 + 2^2 = 20
 2^2 + 0^2 = 4
 4^2 = 16
 1^2 + 6^2 = 37
 3^2 + 7^2 = 58
 5^2 + 8^2 = 89
 8^2 + 9^2 = 145 :(

 Ex: 19 :)
 1^2 + 9^2 = 82
 8^2 + 2^2 = 68
 6^2 + 8^2 = 100
 1^2 + 0^2 + 0^2 = 1 :)

 Write a function which determines whether or not a number is happy or sad.

 //stop case where number == 1 return true
 //stop case where we've seen the number before return false
 //else perform sum of squares on new value again
 */
import java.util.HashMap;

public class HappyNumber {

    public static void main(String[] args) {
        int[] numbers = new int[]{19, 145, 100};
        for(int i : numbers){
            HappyNumber happyNumber = new HappyNumber();
            System.out.println(" " + i + " --> " + happyNumber.isHappy(i));
//            System.out.println(" " + i + " --> " + happyNumber.getSumOfSquares(i));
        }

    }

    private boolean isHappy(int number){
        if(number < 10){
            return number == 1;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int result = isHappy(map, number);
        return result == 1;
    }

    private int isHappy(HashMap<Integer, Integer> map, int number){
        if(number <= 0){
            return 0;
        }

        if (!map.containsKey(number)) {
            int sumOfSquares = getSumOfSquares(number);
            map.put(number, sumOfSquares);

            if (sumOfSquares < 10) {
                return sumOfSquares;
            }

            map.put(number, isHappy(map, sumOfSquares));

        }

        return map.get(number);
    }

    private int getSumOfSquares(int number){
        if(number == 0){
            return 0;
        }

        return ((number % 10) * (number % 10)) + getSumOfSquares(number / 10);
    }
}
