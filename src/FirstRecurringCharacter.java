import java.util.HashSet;

public class FirstRecurringCharacter {

    public static void main(String args[]) {
        String[] s = new String[]{"input", "output"};
        for (String a : s) {
            System.out.printf("String=%-10s Recurring character=%c\n",a, findRecurringCharacter(a));
        }
    }

    private static char findRecurringCharacter(String input) {
        if (input == null || input.length() <= 0) {
            return '\0';
        }

        HashSet<Character> set = new HashSet<>();
        return findRecurringCharacter(input, set);
    }

    private static char findRecurringCharacter(String input, HashSet<Character> set) {
        if (input == null || input.length() <= 0) {
            return '\0';
        }


        if(set.contains(input.charAt(0))){
            return input.charAt(0);
        }

        set.add(input.charAt(0));
        return findRecurringCharacter(input.substring(1), set);
    }
}
