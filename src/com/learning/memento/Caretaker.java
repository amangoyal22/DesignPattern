package com.learning.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The type Caretaker.
 */
public class Caretaker {

    /**
     * The States.
     */
    private List<Memento> states;

    /**
     * Push.
     *
     * @param memento the memento
     */
    public void push(Memento memento) {
        if (Objects.isNull(states)) {
            states = new ArrayList<>();
        }
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
