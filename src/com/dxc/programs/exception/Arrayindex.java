package com.dxc.programs.exception;

public class Arrayindex {
    public static void main(String[] args) {
        int arr[]=new int[10];
       try{
           arr[10]=100;
       }
       catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Array index not found" );
       }
    }
}
