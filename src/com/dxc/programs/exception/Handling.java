package com.dxc.programs.exception;

class Handling{
    public static void main(String[] args) {


        try {
            int res, a = 1, b = 0;
            res = a / b;
            System.out.println("res is " + res);
        } catch (ArithmeticException e) {
            System.out.println("arithmetic exception");
        } finally {
            System.out.println(" final block executes");
        }
    }
}