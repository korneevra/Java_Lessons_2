package Algorithms.HWLesson3;

import Lesson_2_6.List;

import java.awt.*;

public class RevertList {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.revert();

        Node i = list.head;
        while (i != null) {
            System.out.println(i.value);
            i = i.next;
        }

    }
}
    class Node {
        int value;
        Node next;
        Node previous;
    }

    class MyLinkedList {
        Node head;
        Node tail;

        public void add(int value){
            Node node = new Node();
            node.value = value;
            if(head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                node.previous = tail;
                tail = node;
            }
        }

        public void revert() {
            Node node = head;
            while (node != null) {
                Node next = node.next;
                Node previous = node.previous;
                node.next = previous;
                node.previous = next;
                if (previous == null) {
                    tail = node;
                }
                if (next == null) {
                    head = node;
                }
                node = next;
            }

        }
    }

