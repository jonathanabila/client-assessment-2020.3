package com.assessment.infnet.model.models;

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

    public Buy(Integer id, LocalDateTime date, boolean forDelivery) {
        this();
        this.id = id;
        this.date = date;
        this.forDelivery = forDelivery;
    }

    public void setItems(List<Product> items) {
        this.items = items;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public String getDate() {
        return this.date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }

    @Override
    public String toString() {
        return String.format(
                "%s;%s;%s;%d",
                this.getDate(),
                this.forDelivery,
                this.buyer,
                this.items.size()
        );
    }
}

