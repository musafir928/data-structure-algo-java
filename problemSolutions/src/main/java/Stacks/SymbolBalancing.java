package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class SymbolBalancing {
    public static void main(String[] args) {
        System.out.println("Enter your expression: ");
        Scanner s = new Scanner(System.in);
        String expression = s.next();
        System.out.println(balanceCheck(expression));
    }

    public static boolean balanceCheck(String expr) {
        Stack<Character> myStack = new Stack<>();
        for (Character c : expr.toCharArray()) {
            if("([{}])".contains(""+c)){
                if("([{".contains(""+c)){
                    myStack.push(c);
                } else {
                    if(myStack.isEmpty()) return false;
                    switch (c){
                        case ')':
                            if(!myStack.pop().equals('(')) return false;
                            break;
                        case ']':
                            if(!myStack.pop().equals('[')) return false;
                            break;
                        case '}':
                            if(!myStack.pop().equals('{')) return false;
                            break;
                    }

                }
            }
        }
        return myStack.isEmpty();
    }
}
