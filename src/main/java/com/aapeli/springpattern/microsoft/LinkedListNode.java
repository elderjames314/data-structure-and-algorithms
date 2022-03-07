package com.aapeli.springpattern.microsoft;

/**
 * @author jamesoladimeji
 * @created 01/02/2022 - 5:23 AM
 * @project IntelliJ IDEA
 */
public class LinkedListNode {
    private int data;
    private LinkedListNode nextNode;

    public LinkedListNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LinkedListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(LinkedListNode node) {
        this.nextNode = node;
    }

    @Override
    public String toString() {
        return "LinkedListNode{" +
                "data=" + data +
                ", nextNode=" + nextNode +
                '}';
    }
}
