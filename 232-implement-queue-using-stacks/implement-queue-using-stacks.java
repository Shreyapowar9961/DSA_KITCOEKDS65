import java.util.*;

class MyQueue {
    private Stack<Integer> input;
    private Stack<Integer> output;

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {
        input.push(x); // Always push to input stack
    }

    public int pop() {
        shiftStacks(); // Move elements if output is empty
        return output.pop();
    }

    public int peek() {
        shiftStacks(); // Move elements if output is empty
        return output.peek();
    }

    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }

    // Helper: move elements from input to output if needed
    private void shiftStacks() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
    }
}
