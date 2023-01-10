// package com.company;

public class LinkListSuv {

    public static void traversal(Node head) {
        while (head != null) {
            System.out.println(head.getVal());
            head = head.getNext();
        }

    }

}
