import java.util.*;
class MorseCode {
    private static final HashMap<String, String> morseCodeMap = buildMorseCodeMap();

    public static void main(String args[]) {
        String[] words = {"?", "?.", ".?", "?-?", "", " "};
        for (String word : words) {
            System.out.printf("Possibilities for %s are : ", word);
            ArrayList<String> list = possibilities(word);
            for (String s : list) {
                System.out.printf("%s ", s);
            }
            System.out.println();
            list.clear();
        }

    }
    public static ArrayList<String> possibilities( String word ) {
        return get(word);
    }
  
      /*
      * Approach 1: Either find all the permutations for the pattern (O(n^2))
      * Approach 2: Use regex to see if the definite string matches(string without ?)
      */

    private static HashMap<String, String> buildMorseCodeMap(){
        HashMap<String, String> map = new HashMap<>();
        map.put("A", ".-");
        map.put("B", "-...");
        map.put("C", "-.-.");
        map.put("D", "-..");
        map.put("E", ".");
        map.put("F", "..-.");
        map.put("G", "--.");
        map.put("H", "....");
        map.put("I", "..");
        map.put("J", ".---");
        map.put("K", "-.-");
        map.put("L", ".-..");
        map.put("M", "--");
        map.put("N", "-.");
        map.put("O", "---");
        map.put("P", ".--.");
        map.put("Q", "--.-");
        map.put("R", ".-.");
        map.put("S", "...");
        map.put("T", "-");
        map.put("U", "..-");
        map.put("V", "...-");
        map.put("W", ".--");
        map.put("X", "-..-");
        map.put("Y", "-.--");
        map.put("Z", "--..");
        return map;
    }

    private static ArrayList<String> get(String word){
        ArrayList<String> list = new ArrayList<>();
        if(word.isEmpty()) {
            return list;
        }else{
            for(HashMap.Entry<String, String> entry : morseCodeMap.entrySet()){
                if(isValid(word, entry.getValue())){
                    //check the pattern
                    if(isMatching(word, entry.getValue())){
                        list.add(entry.getKey());
                    }
                }
            }

        }

        return list;
    }

    private static boolean isMatching(String word, String morseCode){
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) != '?'){
                if(word.charAt(i) != morseCode.charAt(i)){
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isValid(String word, String morseCode){
        return word.length() == morseCode.length();
    }
}