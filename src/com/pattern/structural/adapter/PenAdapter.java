package com.pattern.structural.adapter;

/**
 * The type Pen adapter.
 */
public class PenAdapter implements Pen {

    /**
     * The Pilot pen.
     */
    private static final PilotPen PILOT_PEN = new PilotPen();

    @Override
    public void write(String str) {
        PILOT_PEN.mark(str);
    }
}
