package com.ihasan.imrul.model;

public enum DeviceType {
    DESKTOP("Personal computer"),
    MOBILE("Smartphone"),
    TABLET("Tablet");

    private final String description;

    private DeviceType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
