package com.assessment.infnet.model.models;


public class CoffeeMachine extends com.assessment.infnet.model.models.Product {
    private boolean strengthControl;
    private boolean temperatureControl;

    public CoffeeMachine() {
        this.setProductType("C");
    }

    public void setStrengthControl(boolean strengthControl) {
        this.strengthControl = strengthControl;
    }

    public void setTemperatureControl(boolean temperatureControl) {
        this.temperatureControl = temperatureControl;
    }

    public boolean getStrengthControl() {
        return this.strengthControl;
    }

    public String getTemperatureControlString(boolean temperatureControl) {
        if(this.temperatureControl) {
            return "Sim";
        } else {
            return "Não";
        }
    }

    public String getStrengthControlString() {
        if(this.strengthControl) {
            return "Sim";
        } else {
            return "Não";
        }
    }

    public boolean getTemperatureControl() {
        return this.temperatureControl;
    }
}
