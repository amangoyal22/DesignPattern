package com.pattern.behavior.memento;

/**
 * The type Memento. Used to undo mechanism in classes.
 */
public class MementoTest {

    private static final String PRINT = "Current Content : ";

    /**
     * The entry point of application.
     * Single Responsibility Principle.
     * @param args the input arguments
     */
    public static void main(String[] args) {
        var org = new Originator();
        var careTaker = new Caretaker();

        org.setContent("a");
        careTaker.push(org.createState());
        org.setContent("b");
        careTaker.push(org.createState());
        org.setContent("c");

        org.restore(careTaker.pop());
        System.out.println(PRINT.concat(org.getContent()));
        org.restore(careTaker.pop());
        System.out.println(PRINT.concat(org.getContent()));

    }
}
