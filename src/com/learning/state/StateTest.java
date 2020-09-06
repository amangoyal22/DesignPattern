package com.learning.state;

/**
 * The type State test.
 */
public class StateTest {
    /**
     * The entry point of application.
     * Open Close Principle.
     * Open for extension.
     * Close for modification.
     * @param args the input arguments
     */
    public static void main(String[] args) {
        var canvas = new Canvas();
        canvas.setCurrentTool(ToolType.SELECTION.getTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
