package com.pattern.creational.singleton;

import java.util.Objects;

/**
 * The type Singleton lazy class.
 */
public class SingletonLazyDoubleCheckLockClass {

    /**
     * The constant instance.
     */
    private static SingletonLazyDoubleCheckLockClass INSTANCE = null;

    /**
     * Instantiates a new Singleton class.
     */
    private SingletonLazyDoubleCheckLockClass() {
        System.out.println("Lazy Synchronized Double Checked Lock Class instance created");
    }
    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static SingletonLazyDoubleCheckLockClass getInstance() {
        if (Objects.isNull(INSTANCE)) {
            synchronized (SingletonLazyDoubleCheckLockClass.class) {
                if (Objects.isNull(INSTANCE)) {
                    INSTANCE = new SingletonLazyDoubleCheckLockClass();
                }
            }
        }
        return INSTANCE;
    }
}
