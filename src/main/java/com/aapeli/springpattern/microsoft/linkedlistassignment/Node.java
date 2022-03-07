package com.aapeli.springpattern.microsoft.linkedlistassignment;

/**
 * @author jamesoladimeji
 * @created 01/02/2022 - 9:30 AM
 * @project IntelliJ IDEA
 */
public class Node {
    private int data;
    private Node node;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", node=" + node +
                '}';
    }
}
