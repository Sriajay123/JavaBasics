package com.dxc.programs.collections;

import java.util.ArrayList;

public class ArraylistDemo {
    public static void main(String[] args) {
        ArrayList  arr=new ArrayList();
        arr.add(10);
        arr.add("hiii");
        arr.add(10.0);
        arr.remove(1);//removing an element at specific location
        arr.add(1 ,30);//adding an element at specific location

        System.out.println(arr);
    }
}
