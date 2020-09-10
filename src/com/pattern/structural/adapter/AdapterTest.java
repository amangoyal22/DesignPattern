package com.pattern.structural.adapter;

/**
 * The type Adapter test.
 */
public class AdapterTest {
    /**
     * The entry point of application.
     * Pen Adapter calls other class.
     * One Class to implement the work and connect interface
     * @param args the input arguments
     */
    public static void main(String[] args) {
        final var assignmentWork = new AssignmentWork();
        assignmentWork.setPen(new PenAdapter());
        assignmentWork.writeAssignment("Write Something: Adapter Pattern Test");
    }
}
