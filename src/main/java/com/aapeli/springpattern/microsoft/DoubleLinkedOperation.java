package com.aapeli.springpattern.microsoft;

/**
 * @author jamesoladimeji
 * @created 01/02/2022 - 8:34 AM
 * @project IntelliJ IDEA
 */
public class DoubleLinkedOperation {
    private DoubleLinkedNode head;

    public void insertAtHead(int data) {
        DoubleLinkedNode newNode = new DoubleLinkedNode(data);

        newNode.setNextNode(this.head);

        if(head != null) {
            head.setPrevNode(newNode);
        }

        this.head = newNode;
    }

    @Override
    public String toString() {
        DoubleLinkedNode current = this.head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNextNode();
        }
        return null;
    }

    public static void main(String[] args) {
        DoubleLinkedOperation doubleLinkedOperation = new DoubleLinkedOperation();
        doubleLinkedOperation.insertAtHead(12);
        doubleLinkedOperation.insertAtHead(13);

        System.out.println(doubleLinkedOperation);
    }

}
