package com.learning.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Caretaker.
 */
public class Caretaker {

    /**
     * The States.
     */
    private List<Memento> states = new ArrayList<>();

    /**
     * Push.
     *
     * @param memento the memento
     */
    public void push(Memento memento) {
        states.add(memento);
    }

    /**
     * Pop memento.
     *
     * @return the memento
     */
    public Memento pop() {
        final var lastIndex = states.size() - 1;
        final var lastState = states.get(lastIndex);
        states.remove(lastState);
        return lastState;
    }
}
