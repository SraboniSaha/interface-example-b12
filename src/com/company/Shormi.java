package com.company;

public class Shormi implements Human{
    @Override
    public void sleeps() {
        System.out.println("nicely");

    }

    @Override
    public void eats() {
        System.out.println("Burger");

    }

    @Override
    public void runs() {
        System.out.println("fast");

    }

    @Override
    public void works() {

        System.out.println("job");

    }


}
