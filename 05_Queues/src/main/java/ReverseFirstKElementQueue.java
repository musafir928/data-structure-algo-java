import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ReverseFirstKElementQueue {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            queue.add(i);
        }
        System.out.println(ReverseFirstK(queue, 4));
    }

    public static Deque ReverseFirstK(Deque<Integer> queue, int k) {
        Stack<Integer> stack = new Stack<>();
        for(int i=1; i<=k; i++) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.remove());
        }
        return queue;
    }
}
