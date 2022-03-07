package com.aapeli.springpattern.microsoft;

/**
 * @author jamesoladimeji
 * @created 09/02/2022 - 4:27 AM
 * @project IntelliJ IDEA
 */
public class Stack {
    private int capacity;
    private int[] stacks;
    private int top;

    public Stack(int capacity) {
        stacks = new int[capacity];
        this.top--;
    }

    public void push(int value) {
        if(isFull())
            throw new RuntimeException("Stack is full");
        stacks[top++] = value;
    }
    public int pop(){
        if(isEmpty())
            throw new RuntimeException("Stack is empty");
        return stacks[top--];
    }
    public int peek() {
        if(isEmpty())
            throw new RuntimeException("Stack is empty");
        return stacks[top];
    }

    private boolean isFull() {
        return top == capacity - 1;
    }
    private boolean isEmpty() {
        return top == -1;
    }




}
