package HWLesson4;

import Lesson_2_6.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        printNode(treeCreate(list, list.size()), "");
    }

    static void printNode(Node node, String sp) {
        if (node != null) {
            System.out.println(sp + node.value);
            printNode(node.left, sp + " ");
            printNode(node.right, sp + " ");

        }
    }

    static Node treeCreate (ArrayList list, int n) {
        Node node = null;
        if (n == 0) {
            return node;
        } else {
            node = new Node((int) list.get(0));
            list.remove(0);
            node.left = treeCreate(list, n / 2);
            node.right = treeCreate(list, n - n / 2 - 1);
        }
        return node;
    }

    static class Node {
        int value;

        public Node(int value) {
            this.value = value;
        }

        Node left;
        Node right;
    }
}
