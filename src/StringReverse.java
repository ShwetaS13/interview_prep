/**
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 * Example 1:
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 */

public class StringReverse {
    public static void main(String args[]) {
        StringReverse reverse = new StringReverse();
        String[] stringsToReverse = {"Let's take LeetCode contest", "a"};

        for (String strings : stringsToReverse) {
            String reversedString = reverse.reverseWords(strings);
            System.out.printf("%s --> %s\n", strings, reversedString);
        }
    }

    public String reverseWords(String s) {
        String[] parts = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String part : parts){
//            sb.append(reverseString(part));
            sb.append(reverse(part));
            sb.append(" ");
        }

        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();

    }

    //String reverse using Iteration
    private String reverseString(String s){

        char[] charArray = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while(start <= end){
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }


        return String.valueOf(charArray);
    }

    //String reverse using Recursion
    private String reverse(String s) {
        if (s.length() == 0) {
            return "";
        }

        return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
    }

}