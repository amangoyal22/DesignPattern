package com.pattern.creational.singleton;

import java.util.Objects;

/**
 * The type Singleton lazy class.
 */
public class SingletonLazySyncClass {

    /**
     * The constant instance.
     */
    private static SingletonLazySyncClass INSTANCE = null;

    /**
     * Instantiates a new Singleton class.
     */
    private SingletonLazySyncClass() {
        System.out.println("Lazy Synchronized Class instance created");
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static synchronized SingletonLazySyncClass getInstance() {
        if (Objects.isNull(INSTANCE)) {
            INSTANCE = new SingletonLazySyncClass();
        }
        return INSTANCE;
    }
}
