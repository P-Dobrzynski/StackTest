package com.company.stack;

public class Main {
    static StackTest<Integer> myStack = new StackTest<>();
    static StackArrayTest<Integer> myStackArray = new StackArrayTest<>();
    public static void main(String[] args) {

        fillTheStack();
        System.out.println(" stack is full ? " + myStack.isFull());
        System.out.println(" is stack empty ? " + myStack.isEmpty());
        myStack.push(11);
        myStack.pop();
        System.out.println(" stack is full ? " + myStack.isFull());
        System.out.println(" top of the stack is : " + myStack.top());
        fillTheArrayStack();
        System.out.println(" top of the array is : " + myStackArray.top());
        System.out.println(" array is full ? " + myStackArray.isFull());
        System.out.println(" array is empty ? " + myStackArray.isEmpty());
        myStackArray.push(666);
        System.out.println(myStackArray.top());
        myStackArray.push(5);
        int a = myStackArray.top();
        System.out.println("top: " + a);
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
    public static void fillTheArrayStack() {
        myStackArray.push(1);
        myStackArray.push(2);
        myStackArray.push(3);
        myStackArray.push(4);
        myStackArray.push(5);
        myStackArray.push(6);
        myStackArray.push(7);
        myStackArray.push(8);
        myStackArray.push(9);
        myStackArray.push(10);
        myStackArray.push(11);
        myStackArray.pop();
        myStackArray.pop();

    }

}
