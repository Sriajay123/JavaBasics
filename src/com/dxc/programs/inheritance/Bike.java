package com.dxc.programs.inheritance;

class Bike {

    public Bike()
    {
        System.out.println("hii");
    }



}

//Single level

class Yamaha extends Bike {
    public void yamaha()
    {
        System.out.println("Yamaha");
    }

}
//multilevel

class RX extends Yamaha{
    public void rx()
    {
        System.out.println("RX");
    }
}

// Hierarchical

class Hero extends Bike {
    public void hero()
    {
        System.out.println("Hero");
    }

}

class Test{
    public static void main(String[] args) {
        Bike  b=new Bike();
       b.drive();

    }
}

