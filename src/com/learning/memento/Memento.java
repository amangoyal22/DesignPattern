package com.learning.memento;

/**
 * The type Memento.
 */
public class Memento {
    /**
     * The Content.
     */
    private String content;

    /**
     * Instantiates a new Memento.
     *
     * @param content the content
     */
    public Memento(final String content) {
        this.content = content;
    }

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent() {
        return content;
    }
}