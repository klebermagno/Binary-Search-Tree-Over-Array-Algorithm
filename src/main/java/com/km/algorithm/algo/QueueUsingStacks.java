package com.km.algorithm.algo;

import java.util.NoSuchElementException;
import java.util.Stack;

public final class QueueUsingStacks<E> {

    private final Stack<E> iStack = new Stack<>();
    private final Stack<E> oStack = new Stack<>();

    
    
    public void enqueue(E e) {
        iStack.push(e);
    }

    public E dequeue() {
        if (oStack.isEmpty()) {
            if (iStack.isEmpty()) {
                throw new NoSuchElementException("No elements present in Queue");
            }
            while (!iStack.isEmpty()) {
                oStack.push(iStack.pop());
            }
        }
        return oStack.pop();
    }

    public boolean isEmpty() {
        if (oStack.isEmpty() && iStack.isEmpty()) {
            return true;
        }
        return false;
    }

    public int size() {
        return iStack.size() + oStack.size();
    }

}