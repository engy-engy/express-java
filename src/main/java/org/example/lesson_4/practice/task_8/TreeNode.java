package org.example.lesson_4.practice.task_8;

/**
 * Узел дерева. Каждый узел содержит ссылки на левого и правого потомка
 */
public class TreeNode {
    private int val;
    private TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
