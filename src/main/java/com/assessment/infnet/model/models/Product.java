package com.assessment.infnet.model.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Product {
    public Integer id;
    public float price;
    public String description;
    private LocalDate releaseDate;
    public String productType;
    private List<Buy> buys;

    public Product() {}

    public Product(Integer id) {
        this();
        this.setId(id);
    }

    public Product(Integer id, float price, String description, String productType) {
        this(id);
        this.price = price;
        this.description = description;
        this.productType = productType;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setReleaseDate(String releaseDate) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.releaseDate = LocalDate.parse(releaseDate, dtf);
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public Integer getId() {
        return id;
    }

    public float getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getProductType() {
        return productType;
    }

    public List<Buy> getBuys() {
        return buys;
    }

    public void setBuys(List<Buy> buys) {
        this.buys = buys;
    }

    public String getProductTypeString() {
        switch (this.productType) {
            case "C":
                return "Máquina de café";
            case "K":
                return "Teclado";
            case "M":
                return "Monitor";
        }
        return this.productType;
    }
}
