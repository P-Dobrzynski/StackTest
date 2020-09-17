package com.company.stack;

public class StackTest<T> implements Stack {
    private Item<T> top = null;
    private int counter = 0;

    private static class Item<T> {
        public T data;
        public Item<T> next;
        public Item<T> previous;

        public Item(T data ) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    @Override
    public void push(Object data) {
        Item<T> item = new Item<T>((T) data);
        if ( isEmpty() == true ) {
        top = item;
        } else {
            top.next = item;
            item.previous = top;
            top = item;
        }
        counter++;
    }

    @Override
    public Object pop() {
        if ( isEmpty() == true) {
            return false;
        } else {
            top = top.previous;
            top.next = null;
            counter --;
        }
            return true;
    }

    @Override
    public Object top() {
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
        return false;
    }
}
