package com.pattern.creational.builder;

/**
 * The type Phone.
 */
public class Phone {

    /**
     * The Os.
     */
    private OperatingSystem os;
    /**
     * The Processor.
     */
    private String processor;
    /**
     * The Screen size.
     */
    private double screenSize;
    /**
     * The Battery.
     */
    private int battery;
    /**
     * The Camera.
     */
    private int ram;

    /**
     * Instantiates a new Phone.
     *
     * @param os         the os
     * @param processor  the processor
     * @param screenSize the screen size
     * @param battery    the battery
     * @param ram        the ram
     */
    public Phone(OperatingSystem os, String processor, double screenSize, int battery, int ram) {
        this.os = os;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                ", ram=" + ram +
                '}';
    }
}
