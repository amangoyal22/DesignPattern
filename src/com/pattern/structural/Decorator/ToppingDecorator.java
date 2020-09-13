package com.pattern.structural.Decorator;

/**
 * The type Topping decorator.
 */
public abstract class ToppingDecorator implements Pizza {

    /**
     * The Temp pizza.
     */
    protected Pizza tempPizza;

    /**
     * Instantiates a new Topping decorator.
     *
     * @param tempPizza the temp pizza
     */
    public ToppingDecorator(Pizza tempPizza) {
        this.tempPizza = tempPizza;
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }

    @Override
    public double getCost() {
        return tempPizza.getCost();
    }
}
