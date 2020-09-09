package com.pattern.creational.singleton;

/**
 * The type Singleton class.
 */
public class SingletonEagerClass {

    /**
     * The constant instance.
     */
    private static final SingletonEagerClass INSTANCE = new SingletonEagerClass();

    /**
     * Instantiates a new Singleton class.
     */
    private SingletonEagerClass() {
        System.out.println("Eager Class instance created");
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static SingletonEagerClass getInstance() {
        return INSTANCE;
    }
}
