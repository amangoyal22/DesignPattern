package com.pattern.behavior.state;

/**
 * The type Brush tool.
 */
public class BrushTool implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("Brush icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a line");
    }
}
