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
        Item<T> item = new Item<>(data);
        if (isEmpty()) {
            top = item;
            counter++;
        } else if (isFull()){
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
        if (isEmpty()) {
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
        return counter == 0;
    }

    @Override
    public boolean isFull() {
        return counter == max;
    }
}
