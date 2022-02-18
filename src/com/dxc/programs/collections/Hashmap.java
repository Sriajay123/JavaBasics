package com.dxc.programs.collections;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        Map<String ,Integer> hash =new HashMap<String,Integer>();
        hash.put("hii",10);
        hash.put("welcome to",20);
        hash.put("Dxc",30);
        for (Map.Entry<String, Integer> e : hash.entrySet())
            System.out.println(e.getKey() + " "+ e.getValue());


        System.out.println(hash);
    }
}
