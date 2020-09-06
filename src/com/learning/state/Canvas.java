package com.learning.state;

/**
 * The type Canvas.
 */
public class Canvas {
    /**
     * The Current tool.
     */
    private Tool currentTool;

    /**
     * Mouse down.
     */
    public void mouseDown() {
        currentTool.mouseDown();
    }

    /**
     * Mouse up.
     */
    public void mouseUp() {
        currentTool.mouseUp();
    }

    /**
     * Gets current tool.
     *
     * @return the current tool
     */
    public Tool getCurrentTool() {
        return currentTool;
    }

    /**
     * Sets current tool.
     *
     * @param currentTool the current tool
     */
    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
