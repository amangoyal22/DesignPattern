package com.pattern.structural.Decorator;

public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza tempPizza) {
        super(tempPizza);
        System.out.println("Adding Dough");
        System.out.println("Adding Mozzarella");
    }

    @Override
    public String getDescription() {
        return super.getDescription().concat(",Mozzarella");
    }

    @Override
    public double getCost() {
        return super.getCost() + 100;
    }
}
