package com.pattern.creational.singleton;

public class SingletonTest {

    public static void main(String[] args) {
        SingletonEagerClass.getInstance();
        SingletonEagerClass.getInstance();

        SingletonLazyClass.getInstance();
        SingletonLazyClass.getInstance();

        final var thread1 = new Thread(() -> SingletonLazySyncClass.getInstance());
        final var thread2 = new Thread(() -> SingletonLazySyncClass.getInstance());
        thread2.start();
        thread1.start();


        final var thread3 = new Thread(() -> SingletonLazyDoubleCheckLockClass.getInstance());
        final var thread4 = new Thread(() -> SingletonLazyDoubleCheckLockClass.getInstance());
        thread3.start();
        thread4.start();


        var test1 = SingletonEnumClass.INSTANCE;
        test1.show();

    }
}
