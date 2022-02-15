package com.dxc.programs.exception;

public class Stringindex {
    public static void main(String[] args) {
        try{
            String S="Iam working in DXC";
             char ch=S.charAt(23);
        }
        catch(StringIndexOutOfBoundsException ex){
            System.out.println("String index is out of bound  ");
        }
    }
}
