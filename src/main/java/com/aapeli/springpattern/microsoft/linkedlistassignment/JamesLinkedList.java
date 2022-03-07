package com.aapeli.springpattern.microsoft.linkedlistassignment;

/**
 * @author jamesoladimeji
 * @created 01/02/2022 - 12:11 PM
 * @project IntelliJ IDEA
 */
public class JamesLinkedList {

    private JamesNode head;

    public static void main(String[] args) {
        JamesLinkedList jamesLinkedList = new JamesLinkedList();
        jamesLinkedList.insert(12);
        jamesLinkedList.insertSorted(2);

        System.out.println(jamesLinkedList);
    }

    @Override
    public String toString() {
        return "JamesLinkedList{" +
                "head=" + head +
                '}';
    }

    public void insert(int data) {
        JamesNode node = new JamesNode(data);

        node.setNextNode(this.head);
        if(head != null) {
            this.head.setPrevNode(node);
        }

        this.head = node;
    }

    public void insertSorted(int data) {
        JamesNode node = new JamesNode(data);
        JamesNode current = this.head;
        while (current != null) {
            if(current.getData() < data) {
                node.setNextNode(current.getNextNode());
                current.setNextNode(node);
                node.setPrevNode(current);
                current.getNextNode().setPrevNode(node);
            }
            current = current.getNextNode();
        }
    }
}
