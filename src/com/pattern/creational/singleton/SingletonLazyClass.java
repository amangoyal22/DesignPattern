package com.pattern.creational.singleton;

import java.util.Objects;

/**
 * The type Singleton lazy class.
 */
public class SingletonLazyClass {

    /**
     * The constant instance.
     */
    private static SingletonLazyClass INSTANCE = null;

    /**
     * Instantiates a new Singleton class.
     */
    private SingletonLazyClass() {
        System.out.println("Lazy Class instance created");
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static SingletonLazyClass getInstance() {
        if (Objects.isNull(INSTANCE)) {
            INSTANCE = new SingletonLazyClass();
        }
        return INSTANCE;
    }
}
