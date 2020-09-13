package com.pattern.structural.composite;

/**
 * The type Composite test.
 */
public class CompositeTest {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        var hd = new Leaf("hard drive", 4000.0);
        var mouse = new Leaf("mouse", 500.0);
        var monitor = new Leaf("monitor", 9000.0);
        var ram = new Leaf("ram", 6000.0);
        var cpu = new Leaf("cpu", 10000.0);

        var ph = new Composite("peri");
        var cabinet = new Composite("cabinet");
        var mb = new Composite("motherboard");
        var computer = new Composite("computer");

        ph.addComponent(mouse);
        ph.addComponent(monitor);

        mb.addComponent(ram);
        mb.addComponent(cpu);

        cabinet.addComponent(hd);
        cabinet.addComponent(mb);

        computer.addComponent(cabinet);
        computer.addComponent(ph);

        computer.showPrice();
    }
}
