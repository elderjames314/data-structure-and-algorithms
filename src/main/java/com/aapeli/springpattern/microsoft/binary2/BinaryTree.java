package com.aapeli.springpattern.microsoft.binary2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author jamesoladimeji
 * @created 06/02/2022 - 3:16 PM
 * @project IntelliJ IDEA
 */
public class BinaryTree {
    Node root;



   /* public Node addRecursive(Node current, int value){

        if(current == null)
            current = new Node(value);
        if(value < current.getValue())
            current.setLeftNode(add(current.getRightNode(), value));
        else if(value > current.getValue())
            current.setRightNode(add(current.getRightNode(), value));
        else
            return current;
        return current;
    }*/

   /* public void add(int value) {
        root = addRecursive(root, value);
    }*/

    public boolean containNodeRecursvie(Node current, int value) {
        if(current == null) return false;
        if(current.getValue() == value) return true;
        if(current.getValue() < value)
            return containNodeRecursvie(current.getLeftNode(), value);
        else
            return containNodeRecursvie(current.getRightNode(), value);
    }

    public void traverseInOrder(Node node) {
        if(node != null) {
            traverseInOrder(node.getLeftNode());
            System.out.println(node.getLeftNode());
            traverseInOrder(node.getRightNode());

            HashMap<Integer, Integer> map = new HashMap<>();
           // map.
      //  ()
        }
    }

    public void travesePreOrder(Node node) {
        if(node != null) {
            System.out.println("parent: "+ node.getValue());
            travesePreOrder(node.getLeftNode());
            travesePreOrder(node.getRightNode());
        }
    }

    public void traversePostOrder(Node node){
        if(node != null) {
            traversePostOrder(node.getLeftNode());
            traversePostOrder(node.getRightNode());
            System.out.println("parent: "+ node.getValue());
        }
    }

    //breadth first search
    public void traverseLevelOrder(Node node) {
        if(node == null) return;
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(node);

        while (!nodes.isEmpty()) {

            Node node1 = nodes.remove();
            System.out.println(node1.getValue());

            if(node1.getLeftNode() != null) nodes.add(node1.getLeftNode());
            if(node1.getRightNode() != null) nodes.add(node1.getRightNode());


        }
    }

    public Node deleteRecursive(Node current, int value) {
        if(current == null) return null;
        if(current.getValue() == value) {
            //case where node has no children
            if(current.getLeftNode() == null && current.getRightNode() == null)
                return null;

            //case where it has one children
            if(current.getLeftNode() == null)
                return current.getRightNode();
            if(current.getRightNode() == null)
                return current.getLeftNode();
            //find node to delete


        }
        if(value < current.getValue()){
            current.setLeftNode(deleteRecursive(current.getLeftNode(), value));
        }
        current.setRightNode(deleteRecursive(current.getRightNode(), value));

        return current;

    }



    public static void main(String[] args) {
      /*  BinaryTree tree = new BinaryTree();
        tree.add(3);
        tree.add(5);
        tree.add(2);
        tree.add(1);
        tree.add(4);*/
    }

}
