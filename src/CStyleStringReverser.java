/**
 * Write code to reverse a C-Style String (C-String means that "abcd" is represented as five characters, including the null character.)
 */
public class CStyleStringReverser {

    public static void main(String args[]) {
        System.out.printf("Is empty ? %b\n", reverse());
    }

    private static boolean reverse() {
        String reversedString = "abcd".replace('a', '\0');
        System.out.println("String is : "+reversedString);
        System.out.println("String is empty? "+reversedString.isEmpty());
        System.out.println("Length of String is: "+reversedString.length());
        return reversedString.isEmpty();
    }
}