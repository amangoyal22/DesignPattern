package com.pattern.creational.builder;

/**
 * The type Builder test.
 */
public class BuilderTest {
    /**
     * The entry point of application.
     * More cleaner and understable and flexible.
     * @param args the input arguments
     */
    public static void main(String[] args) {
        var phoneBuilder = new PhoneBuilder();
        phoneBuilder
                .setOs(OperatingSystem.ANDROID)
                .setBattery(3000)
                .setRam(2);
        System.out.println(phoneBuilder.getPhone());
    }
}
