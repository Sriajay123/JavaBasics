//interface
package com.dxc.programs.interfaceimplementation;

public interface charger {
    public void chargerinfo();
}

class Laptop implements charger{
    public void chargerinfo(){
        System.out.println("laptop is charging ");
    }

    public static void main(String[] args) {
        Laptop l=new Laptop();
        l.chargerinfo();
    }
}
