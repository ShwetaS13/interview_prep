/**
 * String Rotation
 */
public class StringRotater {

    public static void main(String args[]) {
        System.out.println("IsSubstring : "+ isSubstring("waterbottle", "erbottlewat"));
    }

    public static boolean isSubstring(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        } else {
            String newString = s1 + s1;
            for (int i = 0; i < newString.length() - s2.length(); i++) {
                if (newString.substring(i, i + s2.length()).equals(s2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
