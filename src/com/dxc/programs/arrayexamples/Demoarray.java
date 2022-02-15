package com.dxc.programs.arrayexamples;

//array example

public class Demoarray {
    public static void main(String[] args) {
    int[] abc=new int[]{1,2,3,4,5,6,7,8,99};
    abc[7]=100;
    for(int i=0;i<abc.length;i++){
        System.out.println(abc[i]);
    }

    }
}
