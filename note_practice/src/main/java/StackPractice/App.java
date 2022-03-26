package StackPractice;

public class App {
    public static void main(String[] args) {
        Stack myStack = new Stack(0);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        myStack.print();
        myStack.push(2);
        myStack.push(3);
        myStack.print();
    }
}
