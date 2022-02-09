package com.dxc.programs.loops;

public class forloop {
    public static void main(String[] args) {
        int arr[] = {5,10,15,20};
//for loop
        for(int i=0;i< arr.length;i++){
            System.out.println("elements of array are" +arr[i]);
        }
    //enhanced forloop
        for(int k: arr){
            System.out.println("elements of array is"+k);

        }

        } ;
    }
