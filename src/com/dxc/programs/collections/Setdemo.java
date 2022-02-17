package com.dxc.programs.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Setdemo {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        s.add("i");
        s.add("work in");
        s.add("dxc");

        System.out.println(s);

    }
}
