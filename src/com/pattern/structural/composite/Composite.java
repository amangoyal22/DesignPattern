package com.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The type Composite.
 */
public class Composite implements Component {

    /**
     * The Name.
     */
    private String name;
    /**
     * The Component list.
     */
    private List<Component> componentList;

    /**
     * Instantiates a new Composite.
     *
     * @param name the name
     */
    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        componentList.forEach(Component::showPrice);
    }

    /**
     * Add component.
     *
     * @param component the component
     */
    public void addComponent(Component component){
        if (Objects.isNull(componentList)) {
            componentList = new ArrayList<>();
        }
        componentList.add(component);
    }
}
