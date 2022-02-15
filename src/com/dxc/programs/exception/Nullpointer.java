package com.dxc.programs.exception;

public class Nullpointer {
    public static void main(String[] args) {
        String str=null;
        try {
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str);
            }
        }
        catch(NullPointerException ne){
            System.out.println("NullPointerException");
        }
    }
}
