package com.assessment.infnet.model.models;



public class Keyboard extends com.assessment.infnet.model.models.Product {
    private boolean isRBG;
    private boolean isMechanic;

    public Keyboard() {
        this.setProductType("K");
    }

    public void setIsRBG(boolean isRBG) {
        this.isRBG = isRBG;
    }

    public void setIsMechanic(boolean isMechanic) {
        this.isMechanic = isMechanic;
    }

    public boolean getIsRGB() {
        return this.isRBG;
    }

    public boolean getIsMechanic() {
        return this.isMechanic;
    }
}
