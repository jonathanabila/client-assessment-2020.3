package com.assessment.infnet.model.models;


public class Monitor extends com.assessment.infnet.model.models.Product {

    private int screenSize;
    private boolean heightAdjustable;

    public Monitor() {
        this.setProductType("M");
    }

    public int getScreenSize() {
        return this.screenSize;
    }

    public boolean getHeightAdjustable() {
        return this.heightAdjustable;
    }

    public String getHeightAdjustableString() {
        if(this.heightAdjustable) {
            return "Sim";
        } else {
            return "Não";
        }
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public void setHeightAdjustable(boolean heightAdjustable) {
        this.heightAdjustable = heightAdjustable;
    }
}
