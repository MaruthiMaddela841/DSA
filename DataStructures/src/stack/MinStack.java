package stack;

import java.util.Stack;

// https://leetcode.com/problems/min-stack/
class MinStack {

    Stack<Integer> main;
    Stack<Integer> min;

    public MinStack() {
        main= new Stack<>();
        min=new Stack<>();
    }
    
    public void push(int value) {
        main.push(value);
        if(min.isEmpty()){
            min.push(value);
        }else{
            if(value<=min.peek()){
                min.push(value);
            }
        }
    }
    
    public void pop() {
        int value = main.pop();
        if(value == min.peek()){
            min.pop();
        }
    }
    
    public int top() {
        return main.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
