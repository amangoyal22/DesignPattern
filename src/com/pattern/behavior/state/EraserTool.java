package com.pattern.behavior.state;

/**
 * The type Eraser tool.
 */
public class EraserTool implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("Eraser icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Erase something‸");
    }
}
