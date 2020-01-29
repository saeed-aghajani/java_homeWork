package model;


public class Entity {
    private String name;
    private String color;
    private double price;
    private double weight;

    public Entity setName(String name) {
        this.name = name;
        return this;
    }

    public Entity setColor(String color) {
        this.color = color;
        return this;
    }

    public Entity setPrice(double price) {
        this.price = price;
        return this;
    }

    public Entity setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return this.color;
    }

    public double getPrice() {
        return this.price;
    }

    public double getWeight() {
        return this.weight;
    }

    public void  add(Entity entity){
    }
}
