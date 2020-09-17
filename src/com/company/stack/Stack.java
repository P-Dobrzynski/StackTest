package com.company.stack;

public interface Stack<T> {
    void push(T data);
    T pop();
    T top();
    boolean isEmpty();

    //optional - if stack size is limitted
    boolean isFull();
}
