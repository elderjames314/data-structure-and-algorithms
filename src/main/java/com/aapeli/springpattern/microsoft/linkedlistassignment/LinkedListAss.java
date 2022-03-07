package com.aapeli.springpattern.microsoft.linkedlistassignment;

import java.util.Stack;

/**
 * @author jamesoladimeji
 * @created 01/02/2022 - 9:31 AM
 * @project IntelliJ IDEA
 */
public class LinkedListAss {
    private Node head;
    private int length;


    public void reveseTheOrder() {
        /*
        Write a 'reverse' method in the LinkedList class, which reverses the order of the elements of the list.
         */

      //first i may not do in place algorithm which is technincally has performance issues
        //however it will get the work done at first
        Node reversNode;
        Node current = this.head;
        Stack<Node> stacks = new Stack(); //this is first in last out
        while (current != null) {
            stacks.push(current);
            current = current.getNode();
        }


       for(int i = 0; i<= stacks.size() + 1; i++) {
           //System.out.println(stacks.pop().getData());
           //reversNode.setNode();
       }
    }


    public void appendLastNodeToFirst() {
        /*
        Append the last n nodes of a linked list to the beginning of the list. Will keeping the length as a member variable inside
        the LinkedList class, help?
         */
        Node current = this.head;
        this.length = 0;
        Node tail = null;
        while (current != null) {
            this.length++;
           if(current.getNode() == null){
                tail = current;
            }
            current = current.getNode();


        }
        //System.out.println(tail);
        tail.setNode(this.head);
    }

    public void insertAtHead(int data) {

        Node newNode = new Node(data);
        newNode.setNode(head);
        this.head = newNode;


    }

    @Override
    public String toString() {
        Node current = this.head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNode();
        }
        return null;
    }
}
