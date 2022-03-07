package com.aapeli.springpattern.microsoft;

import sun.jvm.hotspot.debugger.cdbg.LineNumberInfo;

/**
 * @author jamesoladimeji
 * @created 01/02/2022 - 5:24 AM
 * @project IntelliJ IDEA
 */
public class LinkedListOperation {

    private LinkedListNode head;

    public static void main(String[] args) {
        LinkedListOperation linkedListOperation = new LinkedListOperation();
        linkedListOperation.insertAtHhead(1);
        linkedListOperation.insertAtHhead(3);


        //linkedListOperation.delete();

       // System.out.println(linkedListOperation.length());
        linkedListOperation.insertNodeSorted(2);

        System.out.println(linkedListOperation);
    }

    public String insertNodeSorted(int data) {
        LinkedListNode newNode = new LinkedListNode(data);
        LinkedListNode current  = this.head;
        while (current != null) {
            if(data < current.getData()) {
                newNode.setNextNode(current.getNextNode());
                current.setNextNode(newNode);
                return "data inserted successfully";
            }
            current = current.getNextNode();
        }
        return null;
    }

    public boolean search(int search) {
        LinkedListNode current = this.head;
        while (current != null) {
            if(current.getData()==search)
                return true;
            current = current.getNextNode();

        }
        return false;
    }

    public void delete() {
        this.head = this.head.getNextNode();
    }

    public int length() {
        LinkedListNode current = this.head;
        int length = 0;
        while (current != null) {
            current = current.getNextNode();
            length++;
        }
        return length;
    }


    public void insertAtHhead(int data) {
        LinkedListNode newNode = new LinkedListNode(data);

        newNode.setNextNode(head);
        this.head = newNode;

    }

    @Override
    public String toString() {
        return "LinkedListOperation{" +
                "head=" + head +
                '}';
    }
}
