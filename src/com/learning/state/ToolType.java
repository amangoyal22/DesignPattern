package com.learning.state;

/**
 * The enum Tool type.
 */
public enum ToolType {
    /**
     * Selection tool type.
     */
    SELECTION(new SelectionTool()),
    /**
     * Brush tool type.
     */
    BRUSH(new BrushTool()),
    /**
     * Eraser tool type.
     */
    ERASER(new BrushTool());

    /**
     * The Tool.
     */
    private Tool tool;

    /**
     * Instantiates a new Tool type.
     *
     * @param tool the tool
     */
    ToolType(final Tool tool) {
        this.tool = tool;
    }

    /**
     * Gets tool.
     *
     * @return the tool
     */
    public Tool getTool() {
        return tool;
    }
}
