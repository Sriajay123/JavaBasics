package com.dxc.programs.decisionmaking;

import java.util.Scanner;

public class Decisonswitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a alphabet");
         String ch=sc.next();

         switch(ch){
             case "a" :
                 System.out.println(" a is vowel");
                  break;
             case "e":
                 System.out.println("e is vowel");
                 break;
             case "i":
                 System.out.println(" i is vowel");
                 break;
             case "o":
                 System.out.println("o is vowel");
                 break;
             case "u":
                 System.out.println("u  is vowel");
                 break;
             default:
                 System.out.println( "is consonant");
                 break;

         }

    }
}
