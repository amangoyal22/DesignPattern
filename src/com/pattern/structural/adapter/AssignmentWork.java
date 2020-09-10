package com.pattern.structural.adapter;

/**
 * The type Assignment work.
 */
public class AssignmentWork {

    /**
     * The Pen.
     */
    private Pen pen;

    /**
     * Write assignment.
     *
     * @param str the str
     */
    public void writeAssignment(final String str) {
        pen.write(str);
    }

    /**
     * Gets pen.
     *
     * @return the pen
     */
    public Pen getPen() {
        return pen;
    }

    /**
     * Sets pen.
     *
     * @param pen the pen
     */
    public void setPen(final Pen pen) {
        this.pen = pen;
    }
}
