package com.assessment.infnet.model.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Product {
    public Integer id;
    public float price;
    public String description;
    private LocalDate releaseDate;

    public Product() {}

    public Product(Integer id, float price, String description, LocalDate releaseDate) {
        this();
        this.id = id;
        this.price = price;
        this.description = description;
        this.releaseDate = releaseDate;
    }

    public String getReleaseDateString() {
        return releaseDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
