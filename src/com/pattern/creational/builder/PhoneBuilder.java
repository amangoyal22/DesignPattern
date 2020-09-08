package com.pattern.creational.builder;

/**
 * The type Phone builder.
 */
public class PhoneBuilder {

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
     * Sets os.
     *
     * @param os the os
     * @return the os
     */
    public PhoneBuilder setOs(final OperatingSystem os) {
        this.os = os;
        return this;
    }

    /**
     * Sets processor.
     *
     * @param processor the processor
     * @return the processor
     */
    public PhoneBuilder setProcessor(final String processor) {
        this.processor = processor;
        return this;
    }

    /**
     * Sets screen size.
     *
     * @param screenSize the screen size
     * @return the screen size
     */
    public PhoneBuilder setScreenSize(final double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    /**
     * Sets battery.
     *
     * @param battery the battery
     * @return the battery
     */
    public PhoneBuilder setBattery(final int battery) {
        this.battery = battery;
        return this;
    }

    /**
     * Sets ram.
     *
     * @param ram the ram
     * @return the ram
     */
    public PhoneBuilder setRam(final int ram) {
        this.ram = ram;
        return this;
    }

    /**
     * Gets phone.
     *
     * @return the phone
     */
    public Phone getPhone() {
        return new Phone(os, processor,screenSize,battery,ram);
    }
}
