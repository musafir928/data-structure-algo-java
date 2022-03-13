import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class CollectionsStack {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i<5; i++) {
            stack.push(i);
        }
        stack.forEach(System.out::println);
        stack.pop();
        stack.pop();
        System.out.println("updated");
        stack.forEach(System.out::println);
    }
}
