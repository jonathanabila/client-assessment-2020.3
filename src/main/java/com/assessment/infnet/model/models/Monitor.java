package com.assessment.infnet.model.models;


public class Monitor extends com.assessment.infnet.model.models.Product {

    public int screenSize;
    public boolean heightAdjustable;

    @Override
    public String toString() {
        return String.format(
                "M;%s;%.2f;%s;%s;%s",
                this.description,
                this.price,
                this.getReleaseDateString(),
                this.screenSize,
                this.heightAdjustable
        );
    }
}
