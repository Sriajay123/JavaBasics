package com.dxc.programs.inheritance;
//Single level
class Bike {

    public Bike() {
        System.out.println("two wheeler");
    }

    public void display() {
        System.out.println("bike ");
    }

}

    class Yamaha extends Bike {

        public Yamaha()
        {
            super();
            System.out.println("started in 1990");
        }
        public void display1() {
            System.out.println("Yamaha");
        }



    }

 class Demo{
    public static void main(String[] args) {

        Yamaha y=new Yamaha();
        y.display();
        y.display1();
    }
}






