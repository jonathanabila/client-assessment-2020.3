package com.assessment.infnet.model.models;



public class Keyboard extends com.assessment.infnet.model.models.Product {

    public boolean isRBG;
    public boolean isMechanic;

    @Override
    public String toString() {
        return String.format(
                "K;%s;%.2f;%s;%s;%s",
                this.description,
                this.price,
                this.getReleaseDateString(),
                this.isRBG,
                this.isMechanic
        );
    }
}
