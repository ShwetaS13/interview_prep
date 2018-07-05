import java.util.Arrays;
import java.util.Stack;

/**
 * Created by Shweta on 8/2/2017.
 *
 * The string {[()]} meets both criteria for being a balanced string, so we print YES on a new line.
 * The string {[(])} is not balanced, because the brackets enclosed by the matched pairs [(] and (]) are not balanced.
 * The string {{[[(())]]}} meets both criteria for being a balanced string, so we print YES on a new line.
 */
public class BalancedBrackets {
    public static void main(String args[]) {
        String[] input = new String[]{"{[()]}", "{[(])}", "{{[[(())]]}}" };
        BalancedBrackets bb = new BalancedBrackets();
        for(String s : input){
            System.out.printf("%s is %s\n", s, bb.isBalanced(s)? "balanced.": "not balanced.");
        }
    }

    public boolean isBalanced(String inputString){
        Stack stack = new Stack();

        for(int i = 0; i < inputString.length(); i++){
            if(isOpeningBrace(inputString.charAt(i))){
                stack.push(inputString.charAt(i));
            } else if (isClosingBrace(inputString.charAt(i))) {
                if(isComplement((char)stack.peek(), inputString.charAt(i))){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }

    private boolean isOpeningBrace(char c){
        if(c == '{' || c == '[' || c == '('){
            return true;
        }

        return false;
    }

    private boolean isClosingBrace(char c){
        if(c == '}' || c == ']' || c == ')'){
            return true;
        }

        return false;
    }

    private boolean isComplement(char c1, char c2){
        if(c1 == '{'){
            return c2 == '}';
        } else if (c1 == '(') {
            return c2 == ')';
        } else if (c1 == '[') {
            return c2 == ']';
        }

        return false;
    }
}
