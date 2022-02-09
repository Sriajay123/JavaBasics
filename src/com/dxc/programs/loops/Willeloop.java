package com.dxc.programs.loops;

import java.util.Scanner;

public class Willeloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        //while loop
        while (num <= 10) {
            System.out.println(+num);
            num++;

        }


        // infinite while loop
        while (true) {
            System.out.println("1. Addition 2.Subtraction 3.Multiplication 4.Division ");
            System.out.println("enter your choice ");
            int ch = sc.nextInt();

         switch (ch){
             case 1:
                 System.out.println("enter value of a and b");
                 int a=sc.nextInt();
                 int b=sc.nextInt();
                    int c;
                    c=a+b;
                 System.out.println("The sum of "+a+ "and"+ b+ "is" +c);
                  break;
             case 2:
                 System.out.println("enter value of a and b");
                  a=sc.nextInt();
                 b=sc.nextInt();
                 int d;
                 d=a-b;
                 System.out.println("The subtraction  of "+a+ "and"+ b+ "is" +d);
                 break;

             case 3:
                 System.out.println("enter value of a and b");
                 a=sc.nextInt();
                 b=sc.nextInt();
                 int mul;
                 mul=a*b;
                 System.out.println("The multiplication   of "+a+ "and"+ b+ "is" +mul);
                 break;

             case 4:
                 System.out.println("enter value of a and b");
                 a=sc.nextInt();
                 b=sc.nextInt();
                 int div;
                 div=a/b;
                 System.out.println("The division  of "+a+ "and"+ b+ "is" +div);
                 break;
             default:
                 System.out.println("enter a valid choice");
                 break;


         }
        }
    }
}
