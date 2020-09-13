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
        Component hd = new Leaf("hard drive", 4000.0);
        Component mouse = new Leaf("mouse", 500.0);
        Component monitor = new Leaf("monitor", 9000.0);
        Component ram = new Leaf("ram", 6000.0);
        Component cpu = new Leaf("cpu", 10000.0);

        Composite ph = new Composite("peri");
        Composite cabinet = new Composite("cabinet");
        Composite mb = new Composite("motherboard");
        Composite computer = new Composite("computer");

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
