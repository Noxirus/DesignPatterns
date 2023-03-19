package Stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedString {

    private final List<Character> leftBrackets = Arrays.asList('(', '<', '[', '{');
    private final List<Character> rightBrackets = Arrays.asList(')', '>', ']', '}');

    public boolean isBalanced(String str){
        Stack<Character> charStack = new Stack<>();
        for(char ch : str.toCharArray()){
            if(isLeftBracket(ch)){
                charStack.push(ch);
            }

            if(isRightBracket(ch)){
                if(charStack.isEmpty()) return false;

                var top =  charStack.pop();
                if(!bracketsMatch(top, ch)) return false;
            }
        }

        return charStack.isEmpty();
    }

    private boolean isLeftBracket(char ch) {
        return leftBrackets.contains(ch);
    }

    private boolean isRightBracket(char ch) {
        return rightBrackets.contains(ch);
    }

    private boolean bracketsMatch(char left, char right){
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}
