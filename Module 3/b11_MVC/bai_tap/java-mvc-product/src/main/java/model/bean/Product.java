package model.bean;

public class Product {
    private int id;
    private String name;
    private double price;
    private String model;
    private String description;

    public Product() {
    }

    public Product(int id, String name, double price, String model, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.model = model;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
