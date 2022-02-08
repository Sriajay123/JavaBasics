package com.dxc.programs.methodoverriding;
//overriding
public class Mobile {
    public void details(String brand,int price){
        System.out.println(" brand is "+brand);
        System.out.println("price is "+price);
    }
}

class Androidmobile extends Mobile {

    public void details(String brand,int price){
        System.out.println(" brand  is "+brand );
        System.out.println("price is "+price);
    }

}

class Test{
    public static void main(String[] args) {
        Mobile m=new Mobile();
        m.details("apple",100000);
        Androidmobile and=new Androidmobile();
        and.details("samsung",10000);
    }
}
