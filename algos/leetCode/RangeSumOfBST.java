package learning.algos.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RangeSumOfBST {

    /*
        URL: https://leetcode.com/problems/range-sum-of-bst/
     */

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        RangeSumOfBST inst = new RangeSumOfBST();
        List<Integer> listOfIntegers = Arrays.asList(10, 5, 15, 3, 7, 18);
        TreeNode node = null;

        for(int i:listOfIntegers) {
            node = inst.insert(node, i);
        }

        inst.inOrderCollect(node, list, 7, 15);

        System.out.println(list.stream().mapToInt(i->i).sum());

        listOfIntegers = Arrays.asList(10,5,15,3,7,13,18,1,6);

        node = null;
        list = new ArrayList<>();

        for(int i:listOfIntegers) {
            node = inst.insert(node, i);
        }

        inst.inOrderCollect(node, list, 6, 10);

        System.out.println(list.stream().mapToInt(i->i).sum());
    }

    void inOrderCollect(TreeNode root, List<Integer> list, int start,
                        int stop) {
        if(root!=null) {
            inOrderCollect(root.left, list, start, stop);
            if(root.val>=start && root.val<=stop) {
                list.add(root.val);
            }
            inOrderCollect(root.right, list, start, stop);
        }
    }

    TreeNode insert(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        if (data < root.val) {
            root.left = insert(root.left, data);
        }

        if (data > root.val) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    public int rangeSumBST(TreeNode root, int L, int R) {
        // TODO write code.
        return 0;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
