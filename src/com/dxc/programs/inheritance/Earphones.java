//Hirarichal
package com.dxc.programs.inheritance;

public class Earphones {

    Earphones()
    {
        System.out.println("earphones Constructor");
    }
    void details(){
        System.out.println("two types 1.Wired  2.Wireless");
    }
}

class Wired_earphones extends Earphones{
    Wired_earphones(){


        System.out.println("Wired earphones constructor");
    }
    void info(){
        System.out.println("requires 3.5mm jack");
    }
}

class Wireless_earphones extends Earphones {
    Wireless_earphones() {
        super();
        System.out.println("Wireless constructor");
    }

    void display() {
        System.out.println("can work with bluetooth");
    }
}

    class Testing{
        public static void main(String[] args) {
            Wireless_earphones w1=new Wireless_earphones();
            Wired_earphones w2=new Wired_earphones();
            w2.info();

            w1.details();


        }
    }
