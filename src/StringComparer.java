/**
 * Created by Shweta on 3/9/2017.
 */
public class StringComparer {
    public static void main(String args[]) {
        System.out.println("Result : "+compare("sh", "Shweta"));
    }

    public static int compare(String string_1, String string_2) {
        String s1 = string_1.toLowerCase();
        String s2 = string_2.toLowerCase();
        int lengthOfFirstString = s1.length();
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < lengthOfFirstString; i++) {
            if (s1.charAt(i) < s2.charAt(i)) {
                result = -1;
                return result;
            } else if (s1.charAt(i) > s2.charAt(i)) {
                result = 1;
                return result;
            } else {
                result = 0;
            }
        }

        return result;
    }
}
