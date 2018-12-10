package com.common.algorithms.data.structure;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhuzhenke
 * @date 2018/12/11
 */
public class BinaryTree {

    public static void main(String[] args) {
        //           20
        //         /    \
        //       15      25
        //      /   \   /  \
        //     12   17 22  30
        //    / \   /
        //   11 13 16
        int[] nodes = new int[]{
                20, 15, 25, 12, 17, 22, 30, 11, 13, 16
        };
        List<Node> nodeList = new ArrayList<>();
        for (int nodeData : nodes) {
            nodeList.add(new Node(nodeData));
        }

        for (int i = 0; i < nodeList.size() / 2; i++) {
            Node node = nodeList.get(i);
            if (2 * i + 1 < nodeList.size()) {
                node.left = nodeList.get(2 * i + 1);
            }
            if (2 * i + 2 < nodeList.size()) {
                node.right = nodeList.get(2 * i + 2);
            }
        }

        System.out.println("inorder:");
        inOrderTreeWalk(nodeList.get(0));
        System.out.println();

        System.out.println("preorder:");
        preOrderTreeWalk(nodeList.get(0));
        System.out.println();

        System.out.println("postorder:");
        postOrderTreeWalk(nodeList.get(0));
        System.out.println();
    }

    public static class Node {
        public Object data;
        public Node left;
        public Node right;

        public Node(Object data) {
            this.data = data;
        }
    }

    /**
     * inorder-tree-walk
     */
    private static void inOrderTreeWalk(Node node) {
        if (node == null) {
            return;
        }
        inOrderTreeWalk(node.left);
        System.out.print(node.data + " ");
        inOrderTreeWalk(node.right);
    }

    /**
     * preorder-tree-walk
     */
    private static void preOrderTreeWalk(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrderTreeWalk(node.left);
        preOrderTreeWalk(node.right);
    }

    /**
     * postorder-tree-walk
     */
    private static void postOrderTreeWalk(Node node) {
        if (node == null) {
            return;
        }
        postOrderTreeWalk(node.right);
        System.out.print(node.data + " ");
        postOrderTreeWalk(node.left);
    }
}
