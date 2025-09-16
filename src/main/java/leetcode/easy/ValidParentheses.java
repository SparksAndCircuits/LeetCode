package leetcode.easy;
import java.util.*;

/*
 * Leetcode question 20 Valid Parentheses
 * 
 * Given a string s containing just the characters '(', ')', '{', '}', '[', ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * 1) Open brackets must be closed by the same type of brackets.
 * 2) Open brackets must be closed in the correct order.
 * 3) Every close bracket has a corresponding open bracket of the same type.
 */

public class ValidParentheses {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else if(c == ')' || c == '}' || c == ']'){
                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();

                if((c == ')' && top != '(') ||
                   (c == '}' && top != '{') ||
                   (c== ']' && top != '[')){
                        return false;
                    }
            }
        }

        return stack.isEmpty();
    }
}
