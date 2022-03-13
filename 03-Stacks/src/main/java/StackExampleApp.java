public class StackExampleApp {
    public static void main(String[] args) {
        var myStack = new MyStack<Integer>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println("myStack.size() = " + myStack.size());
        System.out.println(myStack.pop()); // should be 4
        System.out.println(myStack.pop()); // should be 3
        System.out.println(myStack.pop()); // should be 2
        System.out.println("myStack.size() = " + myStack.size());
    }
}
