package com.aapeli.springpattern.microsoft;

/**
 * @author jamesoladimeji
 * @created 01/02/2022 - 5:53 AM
 * @project IntelliJ IDEA
 */
public class DoubleLinkedList {
    private LinkedListNode head;
    private LinkedListNode tail;

    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.insertAtTail(4);
        doubleLinkedList.insertAtTail(3);
        doubleLinkedList.insertAtTail(2);

        System.out.println(doubleLinkedList);
    }

    public void insertAtTail(int data) {
        LinkedListNode newNode = new LinkedListNode(data);
        if(head == null) {
            this.head = newNode;
            this.tail = newNode;
        }else{
            this.tail.setNextNode(newNode);
            this.tail = newNode;
        }



    }

    @Override
    public String toString() {
        return "DoubleLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}
