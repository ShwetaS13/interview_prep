/**
 * Created by Shweta on 3/6/2017.
 * aabcccccaaa --> a2b1c5a3
 */
public class StringCompressor {

    public static void main(String args[]) {
        System.out.println("Compressed String is : " + compress("aabcccccaaam"));
    }

    public static String compress(String inputString) {
        StringBuilder compressedString = new StringBuilder();

        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
                count = count + 1;
            if (i + 1 >= inputString.length() || inputString.charAt(i) != inputString.charAt(i + 1)){
                compressedString.append(String.format("%c%d", inputString.charAt(i), count));
                count = 0;
            }

        }

        return inputString.length() > compressedString.length() ? compressedString.toString() : inputString;
    }

}
