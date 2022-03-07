package com.aapeli.springpattern.microsoft.binary;

/**
 * @author jamesoladimeji
 * @created 01/02/2022 - 3:02 PM
 * @project IntelliJ IDEA
 */
public class BinarySearchTree {
    private TreeNode root;


    public void delete(int data) {
        TreeNode parent = this.root;
        TreeNode current = this.root;
        boolean isLeftChild = false;

        if(current == null)
            return;

        while (current != null && current.getData() != data) {
            parent = current;
            if(data < current.getData()) {
                 current = current.getLeftChild();
                 isLeftChild = true;
            }else {
                current = current.getRightChild();
                isLeftChild = false;
            }
        }

        if(current == null)
            return;
        if(current.getLeftChild() == null && current.getRightChild()==null) {
            if(current == root) {
                root = null;
            }else {
                if(isLeftChild) {
                    current.setLeftChild(null);
                }else {
                    current.setRightChild(null);
                }
            }
        }else if(current.getRightChild() == null) {
            if(current == root) {
                root = current.getLeftChild();
            }else if(isLeftChild) {
                parent.setLeftChild(current.getLeftChild());
            }else {
                parent.setRightChild(current.getRightChild());
            }
        }
        else if(current.getLeftChild() == null) {
            if(current == root) {
                root = current.getRightChild();
            }else if(isLeftChild) {
                parent.setLeftChild(current.getRightChild());
            }else {
                parent.setRightChild(current.getRightChild());
            }
        }
    }

    public void insert(int data) {
        if(this.root == null)
            root = new TreeNode(data);
        root.insert(data);
    }

    public TreeNode find(int data) {
        if(this.root != null) {
            return root.find(data);
        }
        return null;
    }
}
