package com.dxc.programs.methodoverloading;
// overloading
public class Add {
    int a,b;
    public void addition(int a,int b)
    {
        int sum;
        sum =a+b;
        System.out.println("sum of "+a+  "and " +b+  "is" +sum);
    }
    public void addition(int a,int b,int c)
    {
        int sum;
        sum =a+b+c;
        System.out.println("sum of "+a+ ", " +b+ "," +c+"is" +sum);
    }

    public static void main(String[] args) {
        Add abc =new Add();
        abc.addition(10,20);
        abc.addition(5,10,6);
    }

}
