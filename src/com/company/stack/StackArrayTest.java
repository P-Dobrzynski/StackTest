package com.company.stack;

public class StackArrayTest<T> implements Stack<T>  {
    private static final int STACK_SIZE = 10;
    private T[] stackData;
    private T top;
    private int popCounter = 0;

    public StackArrayTest() {
        stackData = (T[]) new Object[STACK_SIZE];
        this.top = null;
    }

    @Override
    public void push(T data) {
    if ( isEmpty()) {
        this.stackData[0] = data;
        popCounter = 1;
    }else if (isFull()){
        System.out.println(" this stack is full");
    } else {
        if (popCounter-1 <= stackData.length) {
            popCounter++;
            stackData[popCounter-1] = data;
            top = stackData[popCounter-1];
            }
        }
    }


    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("this stack is empty");
            return null;
        }else {
            this.stackData[popCounter-1] = null;
            popCounter--;
            top = this.stackData[popCounter-1];
            return top;
        }
    }

    @Override
    public T top() {
        return top;
    }

    @Override
    public boolean isEmpty() {
        return this.popCounter == 0;
    }

    @Override
    public boolean isFull() {
        return this.popCounter == 10;
    }
}
