package com.assessment.infnet.model.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Buy {
    private Integer id;
    private LocalDateTime date;
    private boolean forDelivery;
    private Buyer buyer;
    private List<Product> items;

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

    public void setId(Integer id) {
        this.id = id;
    }

    public void setForDelivery(boolean forDelivery) {
        this.forDelivery = forDelivery;
    }

    public boolean getForDelivery() {
        return this.forDelivery;
    }

    public String getForDeliveryString() {
        if(this.forDelivery) {
            return "Sim";
        } else {
            return "Não";
        }
    }
}

