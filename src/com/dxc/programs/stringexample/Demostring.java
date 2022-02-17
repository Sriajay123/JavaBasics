package com.dxc.programs.stringexample;

public class Demostring {
    public static void main(String[] args) {

    }

    public static class Stringdemo {
        public static void main(String[] args) {
            String str=new String("apache1604v");
            String str1=str.toUpperCase();
             String str2= str1.concat("tvs");

            System.out.println(str2.length());
            System.out.println(str2);
            System.out.println(str2.charAt(13));
        }
    }
}
