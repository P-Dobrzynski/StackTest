package com.company.stack;


public class StackTest<T> implements Stack<T> {
    private Item<T> top = null;
    private int counter = 0;
    private int max = 10;

    private static class Item<T> {
        public T data;
        public Item<T> next;


        public Item(T data ) {
            this.data = data;
            this.next = null;
        }
    }

    @Override
    public void push(T data) {
        Item<T> item = new Item<T>(data);
        if ( isEmpty() == true ) {
            top = item;
            counter++;
        } else if ( isFull() == true ){
            System.out.println(" stack has reached maximum value");
        } else  {
            Item<T> temp = top;
            top = item;
            top.next = temp;
            counter++;
        }
    }

    @Override
    public T pop() {
        if ( isEmpty() == true) {
           System.out.println("list is empty");
           return null;
        } else {
            top = top.next;
            counter --;
            return (T) top;
        }
    }

    @Override
    public T top() {
        return top.data;
    }

    @Override
    public boolean isEmpty() {
        if ( counter == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isFull() {
        if ( counter == max ) {
            return true;
        } else {
            return false;
        }
    }
}
