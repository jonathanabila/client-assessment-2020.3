package com.assessment.infnet.model.models;


public class CoffeeMachine extends com.assessment.infnet.model.models.Product {
    public boolean strengthControl;
    public boolean temperatureControl;

    @Override
    public String toString() {
        return String.format(
                "K;%s;%.2f;%s;%s;%s",
                this.description,
                this.price,
                this.getReleaseDateString(),
                this.strengthControl,
                this.temperatureControl
        );
    }
}
