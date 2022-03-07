package com.aapeli.springpattern.microsoft;

/**
 * @author jamesoladimeji
 * @created 01/02/2022 - 8:33 AM
 * @project IntelliJ IDEA
 */
public class DoubleLinkedNode {
    private int data;
    private DoubleLinkedNode nextNode;
    private DoubleLinkedNode prevNode;

    public DoubleLinkedNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoubleLinkedNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoubleLinkedNode nextNode) {
        this.nextNode = nextNode;
    }

    public DoubleLinkedNode getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(DoubleLinkedNode prevNode) {
        this.prevNode = prevNode;
    }

    @Override
    public String toString() {
        return "DoubleLinkedNode{" +
                "data=" + data +
                ", nextNode=" + nextNode.getData() +
                ", prevNode=" + prevNode.getData() +
                '}';
    }
}
