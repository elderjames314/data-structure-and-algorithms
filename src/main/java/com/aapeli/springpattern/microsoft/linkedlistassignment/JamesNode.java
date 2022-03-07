package com.aapeli.springpattern.microsoft.linkedlistassignment;

import com.aapeli.springpattern.java8.James;

/**
 * @author jamesoladimeji
 * @created 01/02/2022 - 12:09 PM
 * @project IntelliJ IDEA
 */
public class JamesNode {
    private int data;
    private JamesNode nextNode;
    private JamesNode prevNode;

    public JamesNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public JamesNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(JamesNode nextNode) {
        this.nextNode = nextNode;
    }

    public JamesNode getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(JamesNode prevNode) {
        this.prevNode = prevNode;
    }

    @Override
    public String toString() {
        return "JamesNode{" +
                "data=" + data +
                ", nextNode=" + nextNode +
                ", prevNode=" + prevNode +
                '}';
    }
}

