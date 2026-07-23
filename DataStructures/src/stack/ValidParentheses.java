package stack;

import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {
	
	public boolean isValid(String s) {
        if(s.charAt(0)==']' ||  s.charAt(0)=='}' || s.charAt(0)==')'){
                return false;
        }
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(c==']' ||  c=='}' || c==')'){
                if(stack.isEmpty()) return false;
                if(c==']' && stack.peek()!='[') return false;
                if(c=='}' && stack.peek()!='{') return false;
                if(c==')' && stack.peek()!='(') return false;
                stack.pop();
            }else{
                stack.push(c);
            }
        } 
        return stack.isEmpty();
    }

}
