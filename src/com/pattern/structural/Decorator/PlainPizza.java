package com.pattern.structural.Decorator;

/**
 * The type Plain pizza.
 */
public class PlainPizza implements Pizza{

    @Override
    public String getDescription() {
        return "Thin Dough";
    }

    @Override
    public double getCost() {
        return 0;
    }
}
