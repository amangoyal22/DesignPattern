package com.pattern.structural.Decorator;

public class Sauce extends ToppingDecorator {

    public Sauce(Pizza tempPizza) {
        super(tempPizza);
        System.out.println("Adding Sauce");
    }

    @Override
    public String getDescription() {
        return super.getDescription().concat(",Sauce");
    }

    @Override
    public double getCost() {
        return super.getCost() + 150;
    }
}
