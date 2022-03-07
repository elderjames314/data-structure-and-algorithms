package com.aapeli.springpattern.microsoft.binary;

/**
 * @author jamesoladimeji
 * @created 01/02/2022 - 2:51 PM
 * @project IntelliJ IDEA
 */
public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int data) {
        if(data >= this.data) {
            //go right
            if(this.rightChild==null) {
                rightChild = new TreeNode(data);
            }else {
                this.rightChild.insert(data);
            }
        }else {
            //go left
            if(this.leftChild == null) {
                leftChild = new TreeNode(data);
            }else {
                this.leftChild.insert(data);
            }
        }
    }

    public TreeNode find(int data) {
        if(data==this.data) return new TreeNode(data);
        if(data < this.data && leftChild != null){
            return leftChild.find(data);
        }
        if(rightChild != null)
            return rightChild.find(data);
        return null;
    }

    public int getData() {
        return data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
