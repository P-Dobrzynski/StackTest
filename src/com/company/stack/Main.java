package com.company.stack;

public class Main {
    static StackTest<Integer> myStack = new StackTest<>();

    public static void main(String[] args) {

        fillTheStack();
        System.out.println(" stack is full ? " + myStack.isFull());
        System.out.println(" is stack empty ? " + myStack.isEmpty());
        myStack.push(11);
        myStack.pop();
        System.out.println(" stack is full ? " + myStack.isFull());
        System.out.println(" top of the stack is : " + myStack.top());




    }
    public static void fillTheStack() {
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        myStack.push(8);
        myStack.push(9);
        myStack.push(10);

    }
}
