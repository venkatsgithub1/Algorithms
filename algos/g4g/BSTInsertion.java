package learning.algos.g4g;

import java.util.Arrays;
import java.util.List;

/*
URL: https://practice.geeksforgeeks.org/problems/insert-a-node-in-a-bst/1
 */

public class BSTInsertion {
    Node insert(Node root, int data)
    {
        // Your code here
        if(root==null) {
            root = new Node(data);
            return root;
        }

        if(data<root.data) {
            root.left = insert(root.left, data);
        }

        if(data>root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    class Node
    {
        int data;
        Node left, right;
        Node(int item)
        {
            data = item;
            left = right = null; }
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 81, 87, 42, 66, 90, 45);
        BSTInsertion inst = new BSTInsertion();

        Node root = null;

        for(int i:list) {
            root = inst.insert(root, i);
        }

        inst.inOrder(root);
    }

    private void inOrder(Node node) {
        if(node!=null) {
            inOrder(node.left);
            System.out.println(node.data);
            inOrder(node.right);
        }
    }
}
