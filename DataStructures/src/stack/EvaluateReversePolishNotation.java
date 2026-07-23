package stack;

import java.util.Stack;

// https://leetcode.com/problems/evaluate-reverse-polish-notation/
// Stack
public class EvaluateReversePolishNotation {

	public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String token:tokens){
            if(!("+-*/".contains(token))){
                int k=Integer.parseInt(token);
                stack.push(k);
            }else{
                int x=stack.pop();
                int y=stack.pop();
                if(token.equals("+")) stack.push(y+x);
                if(token.equals("-")) stack.push(y-x);
                if(token.equals("*")) stack.push(y*x);
                if(token.equals("/")) stack.push(y/x);
            }
        }
        return stack.pop();
    }
}
