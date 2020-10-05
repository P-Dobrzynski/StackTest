package com.company.stack;

public class StackArrayTest<T> implements Stack<T>  {
    private int STACK_SIZE = 10;
    private T[] stackData;
    private T top;
    private int popCounter = 0;

    public StackArrayTest() {
        stackData = (T[]) new Object[STACK_SIZE];
        this.top = null;
    }

    @Override
    public void push(T data) {
    if ( this.stackData[0] == null ) {
        this.stackData[0] = data;
        popCounter = 1;
    }else if ( isFull() == true){
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
        if ( isEmpty() == true) {
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
       if ( this.stackData[0] == null) {
           return true;
       } else {
           return false;
       }
    }

    @Override
    public boolean isFull() {
        if (this.stackData[STACK_SIZE - 1] != null) {
            return true;
        } else {
            return false;
        }
    }
}
