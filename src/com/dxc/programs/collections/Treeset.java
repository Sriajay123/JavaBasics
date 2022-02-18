package com.dxc.programs.collections;

import java.util.Set;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args)
    {

        Set<String> str = new TreeSet<>();


        str.add("Ajay");
        str.add("Bharat");
        str.add("Chethan");


        str.add("Chethan");


        System.out.println(str);
    }
}

