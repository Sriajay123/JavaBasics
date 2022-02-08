// multilevel
package com.dxc.programs.inheritance;

public class  Vehicle{

    Vehicle()
    {
        System.out.println("vehicles constructor");
    }
    void show(){
        System.out.println("2wheeler");
        System.out.println("4wheeler");
    }

}

class Twowheeler extends Vehicle{

    Twowheeler(){
        super();
        System.out.println("twowheller constructor");
    }

    void show1(){
        System.out.println("petrol vehicle");
        System.out.println("electric vehicle");
    }

}

class Petrolvehicles extends Twowheeler{

    Petrolvehicles(){
        super();
        System.out.println("Petrol vehicles constructor");
    }

    void show2(){
        System.out.println("twostroke");
        System.out.println("fourstroke");
    }
}

class TestDemo{
    public static void main(String[] args) {
        Petrolvehicles pv=new Petrolvehicles();
        pv.show1();
        pv.show2();
        pv.show();
    }
}
