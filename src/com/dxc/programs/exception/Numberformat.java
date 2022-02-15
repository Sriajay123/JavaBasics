package com.dxc.programs.exception;

public class Numberformat {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("abcdef");
            System.out.println(num);
        }
        catch(NumberFormatException Ne){
            System.out.println("Number format not found");
        }
    }
}
