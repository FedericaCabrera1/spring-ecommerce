package com.wardrobe.wardrobe.model;

public class Product {
    private Integer Id;
    private String name;
    private String description;
    private String image;
    private double price;

    public Product(Integer id, String name, String description, String image, double price) {
        Id = id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
    }

    public Product() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString(){
        return "Product: " + this.name + " " + this.description + " " + this.image + " " + this.price;
    }
}
