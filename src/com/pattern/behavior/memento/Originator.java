package com.pattern.behavior.memento;

/**
 * The type Editor.
 */
public class Originator {

    /**
     * The Content.
     */
    private String content;


    /**
     * Create state memento.
     *
     * @return the memento
     */
    public Memento createState(){
        return new Memento(content);
    }

    /**
     * Restore.
     *
     * @param memento the memento
     */
    public void restore(Memento memento){
        content = memento.getContent();
    }

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(final String content) {
        this.content = content;
    }
}
