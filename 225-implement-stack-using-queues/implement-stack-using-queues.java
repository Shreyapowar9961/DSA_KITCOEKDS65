import java.util.*;

class MyStack {
    private Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.offer(x); // Add new element
        // Rotate the queue to move the new element to the front
        for (int i = 0; i < q.size() - 1; i++) {
            q.offer(q.poll());
        }
    }

    public int pop() {
        return q.poll(); // Remove from front
    }

    public int top() {
        return q.peek(); // Get front element
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
