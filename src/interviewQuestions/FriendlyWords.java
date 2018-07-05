package interviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Shweta on 4/4/2017.
 */
public class FriendlyWords {

    public static void main(String args[]){
        String[] s = {"silent", "listen", "car", "teach", "cheat"};

        String[] result = friendlyWords(s);
        for(String a : result){
            System.out.println(a);
        }
    }
    /**
     * Two words are called friendly if the letters of the first can be rearranged to produce the second (e.g., "silent" and "listen" are friendly).
     * Write a program that given a set of words prints out all friendly words. Each set of friendly words should be printed on a separate line.
     * Words without friends should not be printed. The output should be alphabetically ordered (across lines and within each line).
     *
     * @param  input An array with all the words to be processed.
     * @return An array with each line of the output. Each line should have already the friendly words. (eg.: the first line of the example output is "cheating teaching"
     */


    static String[] friendlyWords(String[] input) {
        ArrayList<HashMap<Character, Integer>> finalMap = new ArrayList<HashMap<Character, Integer>>();
        for (int i = 0; i < input.length; i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            String s = input[i];
            for (int j = 0; j < s.length(); j++) {
                if (!map.containsKey(s.charAt(j))) {
                    map.put(s.charAt(j), 1);
                } else {
                    map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
                }
            }
            finalMap.add(map);
        }

        boolean[] isprinted = new boolean[input.length];

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < finalMap.size(); i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = i + 1; j < finalMap.size(); j++) {
                HashMap<Character, Integer> map1 = finalMap.get(i);
                HashMap<Character, Integer> map2 = finalMap.get(j);

                if (map1.equals(map2) && (!isprinted[i] || !isprinted[j])) {
                    sb.append(input[i]);
                    sb.append(" ");
                    sb.append(input[j]);

                    isprinted[i] = isprinted[j] = true;
                }
            }
            list.add(sb.toString());
        }

        String[] result = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

}

