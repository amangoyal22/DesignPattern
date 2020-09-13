package com.pattern.structural.Decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Pizza basic = new Sauce(new Mozzarella(new PlainPizza()));
        System.out.println(basic.getDescription() + ":" + basic.getCost());
    }
}
