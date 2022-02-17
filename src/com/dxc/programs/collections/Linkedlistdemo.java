package com.dxc.programs.collections;

import java.util.LinkedList;

public class Linkedlistdemo {
    public static void main(String[] args) {
        LinkedList  Ll= new LinkedList();
        Ll.addFirst(10);
        Ll.addLast(200);
        Ll.add(1,100);
        Ll.remove(0);
        Ll.add("hello");
        System.out.println(Ll);
    }
}
