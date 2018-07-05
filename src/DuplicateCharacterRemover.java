/**
 * Design an algorithm and write code to remove the duplicate characters in a string without using any additional buffer.
 * NOTE: One or two additional values are fine. An extra copy of the array is not.
 */
public class DuplicateCharacterRemover {

    public static void main(String args[]) {
        System.out.println("String is: " + remove());
        System.out.println(System.getProperty("java.home"));
    }

    public static boolean remove() {
        String s = "abcde";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }
}