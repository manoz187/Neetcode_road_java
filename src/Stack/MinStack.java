package Stack;

import java.util.Stack;

public class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
         stack = new Stack<>();
         minStack = new Stack<>();

    }

    public void push(int val) {
        stack.push(val);
        val = Math.min(val,minStack.isEmpty() ? val : minStack.peek());
        minStack.push(val);
    }

    public void pop() {
        stack.pop();
        minStack.pop();

    }

    public int top() {
        return stack.peek();

    }

    public int getMin() {
        return minStack.peek();

    }

    public static void main(String[] args) {
        MinStack minStack1 = new MinStack();

        minStack1.push(21);
        minStack1.push(22);

    }



}
