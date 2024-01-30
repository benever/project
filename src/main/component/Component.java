package main.component;

public abstract class Component {
    private String model;

    public Component(String model) {
        this.model = model;
    }

    public abstract void printInfo();

    public String getModel(){
        return this.model;
    }
}