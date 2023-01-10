// package com.company;

import com.company.*;

public class Driver {
    public static void main(String[] args) {
        Node head, second, third, last;
        head = new Node();
        second = new Node();
        third = new Node();
        last = new Node();

        head.setVal(10);
        head.setNext(second);

        second.setVal(20);
        second.setNext(third);

        third.setVal(30);
        third.setNext(last);

        last.setVal(40);
        last.setNext(null);

        LinkListSuv.traversal(head);
    }
}
