//decison making nested if else
package com.dxc.programs.decisionmaking;

import java.util.Scanner;

public class Decisionifelseladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float discount = 0, total_amount = 0;
        for (; ; ) {
            System.out.println("enter the billing amount");
            float bill = sc.nextFloat();

            if (bill > 5000) {
                discount = bill * 0.3f;
                System.out.println("total amount before discount is " + bill);
                total_amount = bill - discount;
                System.out.println("total amount after discount is " + total_amount);
            } else if (bill > 3000) {
                discount = bill * 0.2f;
                System.out.println("total amount before discount is " + bill);
                total_amount = bill - discount;
                System.out.println("total amount after discount is " + total_amount);
            } else if (bill >= 1000) {
                discount = bill * 0.1f;
                System.out.println("total amount before discount is " + bill);
                total_amount = bill - discount;
                System.out.println("total amount after discount is " + total_amount);

            } else {
                System.out.println("total amount  is " + bill);
            }
        }
    }
}
