package com.aapeli.springpattern.microsoft.linkedlistassignment;

/**
 * @author jamesoladimeji
 * @created 01/02/2022 - 9:37 AM
 * @project IntelliJ IDEA
 */
public class LinkedListOperation {
    public static void main(String[] args) {
        LinkedListAss linkedListAss = new LinkedListAss();

        linkedListAss.insertAtHead(12);
        linkedListAss.insertAtHead(13);
        linkedListAss.insertAtHead(14);

       // linkedListAss.appendLastNodeToFirst();

        System.out.println(linkedListAss);

        System.out.println("******");

        linkedListAss.reveseTheOrder();
    }
}
