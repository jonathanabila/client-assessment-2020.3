package com.assessment.infnet.model.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Buy {
    public Integer id;
    public LocalDateTime date;
    public boolean forDelivery;
    public Buyer buyer;
    public List<Product> items;

    public Buy() {}

    public Buy(Integer id, boolean forDelivery) {
        this();
        this.id = id;
        this.forDelivery = forDelivery;
    }

    public List<Product> getItems() {
        return items;
    }

    public void setItems(List<Product> items) {
        this.items = items;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public LocalDateTime getDate() {
        return this.date;
    }

    public void setDate(String date) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.date = LocalDateTime.parse(date, dtf);
    }

    public void setDateNow() {
        this.date = LocalDateTime.now();
    }

    public Integer getId() {
        return id;
    }

    public boolean getForDelivery() {
        return this.forDelivery;
    }
}

