/**
 * Write a program to print all permutations of a given string
 * A permutation, also called an “arrangement number” or “order,” is a rearrangement of the elements of an ordered list S
 * into a one-to-one correspondence with S itself. A string of length n has n! permutation.
 * Below are the permutations of string ABC.
 * ABC ACB BAC BCA CBA CAB
 */
public class StringPermutation {
    public static void main(String[] args)
    {
        String str = "ABC";
        int n = str.length();
        permute(str, 0, n-1);
        str.substring(0, 1);
    }

    /**
     * permutation function
     * @param str string to calculate permutation for
     * @param startIndex starting index
     * @param endIndex end index
     */
    private static void permute(String str, int startIndex, int endIndex)
    {
        if (startIndex == endIndex)
            System.out.println(str);
        else
        {
            for (int i = startIndex; i <= endIndex; i++)
            {
                str = swap(str,startIndex,i);
                permute(str, startIndex+1, endIndex);
                str = swap(str,startIndex,i);
            }
        }
    }

    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    private static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}
